package StreamDemo;

import java.util.ArrayList;
import java.util.Arrays;
import static java.util.Arrays.asList;

import java.util.List;
import java.util.stream.Collectors;


public class MapLambdaDemo {
    
    List<String> stuff = new ArrayList<>();
    
    public MapLambdaDemo() {
        stuff = Arrays.asList("bike", "card", "dime", 
                "film", "game", "fork", 
                "knife", "spoon", "lame");
        
        List<Integer> intList = asList(1,2,3,4,5,6,7,8,9);



         System.out.println(stuff.stream()
                .map(s -> s.toUpperCase()).toList());



         List<String> l22 = stuff.stream().map(s -> s.toUpperCase())
                 .toList();

        System.out.println(stuff);
        System.out.println(l22);

        l22.stream().map(s -> s.replace('I', 'o'))
                .map(s -> s.replace('i', 'O'))
                .forEach(s -> System.out.println(s));



        stuff.stream().map(s -> s.replace('i', 'o'))
                .map(s -> s.replace('e', 'a'))
                .forEach(s -> {System.out.println(s);
                System.out.println(s);
                        });


        System.out.println(stuff.stream().anyMatch(s -> s.equals("bike")));
        System.out.println(stuff.stream().anyMatch(s -> s.equals("fsdgfdgdfgfdg")));

        System.out.println(stuff.stream().count());

    }
    
    
    public static void main(String[] args){
        MapLambdaDemo s = new MapLambdaDemo();
    }

}
