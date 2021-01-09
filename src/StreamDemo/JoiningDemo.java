package StreamDemo;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.text.Collator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import java.util.regex.Pattern;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;


public class JoiningDemo {

    List<String> stuff = new ArrayList<>();
    List<Integer> numbers = new ArrayList<>();
    IntStream intStream;
    Stream stringStream;

    public JoiningDemo() throws FileNotFoundException {
        //Initializing lists
        stuff = Arrays.asList("bike", "öljett", "spoon", "card","dime", 
                "Monopolspel", "film", "game", "åder", "fork", 
                "knife", "ämne", "lame", "film" );
        
        numbers = Arrays.asList(15, 65, 23, 567, 1, 345, 33, 78, 976, 1005);

        System.out.println(stuff.stream()
                .collect(Collectors.joining("-", "%", "*")));


        //Vi kan få strömmar från t.ex BufferedReader
        BufferedReader in = new BufferedReader(
                new FileReader("src\\StreamDemo\\totaleclipse.txt"));
        System.out.println(in.lines().count());


        //Joining, skriver ut låttexten med komma emellan
        BufferedReader in3 = new BufferedReader(
                new FileReader("src\\StreamDemo\\totaleclipse.txt"));
        System.out.println(in3.lines()
                .collect(Collectors.joining(", ")));


        
//        För att skriva ut alla ord i filen i bokstavsordning
        //splitAsStream splittar en ström, med inputen som delimiter (här tomma tecken)
        Pattern p = Pattern.compile("\\s+");
        BufferedReader in2 = new BufferedReader(
                new FileReader("src\\StreamDemo\\totaleclipse.txt"));
        in2.lines().flatMap(s -> p.splitAsStream(s))
                .map(s -> s.toLowerCase())
                .distinct().sorted()
                .forEach(s -> System.out.println(s));

    }

    public static void main(String[] args) throws FileNotFoundException{
        JoiningDemo s = new JoiningDemo();
    }
}
