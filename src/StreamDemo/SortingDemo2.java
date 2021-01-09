package StreamDemo;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.text.Collator;
import java.util.*;
import java.util.regex.Pattern;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;


public class SortingDemo2 {

    List<String> stuff = new ArrayList<>();
    List<Integer> numbers = new ArrayList<>();
    IntStream intStream;
    Stream stringStream;

    public SortingDemo2() throws FileNotFoundException {
        //Initializing lists
        stuff = Arrays.asList("bike", "öljett", "spoon", "card","dime", 
                "Monopolspel", "film", "game", "åder", "fork", 
                "knife", "ämne", "lame", "film" );
        
        numbers = Arrays.asList(15, 65, 23, 567, 1, 345, 33, 78, 976, 1005);
        
        //Initializing streams
        stringStream = Stream.of("green", "yellow", "green", "green", 
                "blue", "black", "white");
        
        intStream = IntStream.of(12, 23, 34, 13, 1);
       
/*        //Distinct
        System.out.println(stringStream.distinct()
                .collect(Collectors.toList()));
        
//        //Sorted() för en List<Integer>
        numbers.stream().mapToInt(e -> e).sorted()
                .forEach(s -> System.out.println(s));


        //Sorted() för strängar sorterar i ASCII-ordning, notera att versaler alltid kommer före gemener
        //å, ä, ö kommer i fel ordning
        System.out.println(stuff.stream().sorted()
                .collect(Collectors.toList()));



        //sorterar baklänges
        System.out.println(stuff.stream()
                .sorted(Comparator.reverseOrder())
                .collect(Collectors.toList()));


 */

        //om vi vill ha svensk sortering:
        Collator svenskCollator = Collator
                .getInstance(new Locale("sv", "SE"));
        System.out.println(stuff.stream().sorted(svenskCollator)
                .collect(Collectors.toList()));


        //Sorterar på svenskt sätt baklänges
        System.out.println(stuff.stream()
                .sorted(svenskCollator.reversed())
                .collect(Collectors.toList()));



    }

    public static void main(String[] args) throws FileNotFoundException{
        SortingDemo2 s = new SortingDemo2();
    }
}
