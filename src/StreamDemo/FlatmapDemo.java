package StreamDemo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import static java.util.Arrays.asList;


public class FlatmapDemo {

    List<String> stuff = new ArrayList<>();

    public FlatmapDemo() {
        stuff = Arrays.asList("bike", "card", "dime", 
                "film", "game", "fork", 
                "knife", "spoon", "lame");

        List<List<String>> deepList = asList(asList("bike", "car"), 
                asList("spoon", "fork", "knife"));
        
        List<List<List<String>>> deepList2 = asList(asList(asList("bike", "car"), 
                asList("spoon", "fork", "knife")));
/*
        System.out.println(deepList);

        System.out.println(deepList.stream().
                flatMap(l -> l.stream()).collect(Collectors.toList()));
                */


        System.out.println(deepList2);

        System.out.println(deepList2.stream()
                .flatMap(l -> l.stream())
                .flatMap(l3 -> l3.stream()).collect(Collectors.toList()));


    }
    
    
    public static void main(String[] args){
        FlatmapDemo s = new FlatmapDemo();
    }

}
