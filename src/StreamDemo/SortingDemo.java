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


public class SortingDemo {

    List<Person> personList = List.of(
            new Person("Kalle", 24, "Swedish", List.of("765543", "4536")),
            new Person("Chuck", 23, "USA", List.of("7654", "24646")),
            new Person("Karen", 56, "Denmark", List.of("765543", "23454")),
            new Person("Dieter", 43, "Germany", List.of("54364", "87676")));


    public SortingDemo() throws FileNotFoundException {

        //Initializing streams
        Stream stringStream = Stream.of("green", "yellow", "green", "green",
                "blue", "black", "white");

        IntStream intStream = IntStream.of(12, 23, 34, 13, 1);

        //Initializing lists
        List<String> stuff = Arrays.asList("bike", "öljett", "spoon", "card","dime",
                "Monopolspel", "film", "game", "åder", "fork", 
                "knife", "ämne", "lame", "film" );

        List<Integer> numbers = Arrays.asList(15, 65, 23, 567, 1, 345, 33, 78, 976, 1005);

//        //Sorted() för en List<Integer>
        numbers.stream().mapToInt(e -> e).sorted()
                .forEach(s -> System.out.println(s));

        numbers.stream().sorted().forEach(s -> System.out.println(s));


        //Sorted() för strängar sorterar i ASCII-ordning, notera att versaler alltid kommer före gemener
        //å, ä, ö kommer i fel ordning
        System.out.println(stuff.stream().sorted().toList());


        //sorterar baklänges
        System.out.println(stuff.stream()
                .sorted(Comparator.reverseOrder()).toList());


        //om vi vill ha svensk sortering:
        Collator svenskCollator = Collator
                .getInstance(new Locale("sv", "SE"));
        System.out.println(stuff.stream().sorted(svenskCollator).toList());


        //Sorterar på svenskt sätt baklänges
        System.out.println(stuff.stream()
                .sorted(svenskCollator.reversed()).toList());

// sortera personer efter namn
        System.out.println(personList.stream()
                .sorted((p1, p2) -> p1.getName().compareToIgnoreCase(p2.getName()))
                .map(Person::getName).toList());


    }

    public static void main(String[] args) throws FileNotFoundException{
        SortingDemo s = new SortingDemo();
    }
}
