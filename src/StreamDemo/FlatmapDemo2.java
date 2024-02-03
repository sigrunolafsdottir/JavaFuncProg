package StreamDemo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import static java.util.Arrays.asList;


public class FlatmapDemo2 {

    List<Person> personList = List.of(
            new Person("Kalle", 24, "Swedish", List.of("765543", "4536")),
            new Person("Chuck", 23, "USA", List.of("7654", "24646")),
            new Person("Karen", 56, "Denmark", List.of("765543", "23454")),
            new Person("Dieter", 43, "Germany", List.of("54364", "87676")));

    FlatmapDemo2(){

        //get all phoneNumbers in personList
        System.out.println(personList.stream().flatMap(n -> n.getPhone().stream()).toList());

        //Unika telefonnummer
        System.out.println(personList.stream().flatMap(n -> n.getPhone()
                .stream()).collect(Collectors.toSet()));


    }
    
    
    public static void main(String[] args){
        FlatmapDemo2 s = new FlatmapDemo2();
    }

}
