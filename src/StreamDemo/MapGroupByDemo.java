package StreamDemo;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.groupingBy;
import static java.util.stream.Collectors.partitioningBy;


public class MapGroupByDemo {

    List<String> stuff;


    public MapGroupByDemo() {

        stuff = Arrays.asList("bike", "öljett", "spoon", "card",
                "dime", "Monopolspel", "film", "game", "åder", 
                "fork", "knife", "ämne", "lame", "film" );

        
        //GroupBy, vi grupperar stuff efter hur långa orden är
        Map<Integer, List<String>> wordLength = stuff.stream()
                .collect(groupingBy(n->n.length()));

        wordLength.forEach((k,v) -> System.out.println(k +" "+v));

        System.out.println(wordLength.get(5));
        
    }

    public static void main(String[] args){
        MapGroupByDemo s = new MapGroupByDemo();
    }
}
