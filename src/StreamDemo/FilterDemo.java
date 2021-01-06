package StreamDemo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import static java.util.Arrays.asList;


public class FilterDemo {

    List<String> stuff = new ArrayList<>();

    public FilterDemo() {
        stuff = Arrays.asList("bike", "card", "dime", 
                "film", "game", "fork", 
                "knife", "spoon", "lame");
        
        List<Integer> intList = asList(1,2,3,4,5,6,7,8,9);

        intList.stream().filter(i -> i > 5)
                .forEach(s -> System.out.println(s));

        stuff.stream().filter(s -> s.length() == 4)
                .forEach(s -> System.out.println(s));



        List <String> listtest = stuff.stream().filter(s -> s.length() == 4)
                .collect(Collectors.toList());

        listtest.forEach(s -> System.out.println(s));

        stuff.stream().filter(s -> s.charAt(0) == 'f')
                .forEach(s -> System.out.println(s));

        stuff.stream().filter(s -> s.contains("am"))
                .forEach(s -> System.out.println(s));

        List<String> l2 = stuff.stream().filter(s -> s.contains("am"))
                .filter(s -> s.contains("g"))
                 .collect(Collectors.toList());
               // .forEach(s -> System.out.println(s));

               l2.forEach(s -> System.out.println(s));


    }
    
    
    public static void main(String[] args){
        FilterDemo s = new FilterDemo();
    }

}
