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

        stuff.stream().filter(str -> str.contains("i")).forEach(s-> System.out.println(s));
        System.out.println();

        stuff.stream().filter(s -> s.contains("i")).filter(s -> s.contains("m"))
                .forEach(s-> System.out.println(s));

        System.out.println();

        stuff.stream().filter(s -> s.contains("i") && s.contains("m"))
                .forEach(s-> System.out.println(s));
        
        List<Integer> intList = asList(1,2,3,4,5,6,7,8,9);

        System.out.println(intList.stream().filter(i -> i < 4).count());

        System.out.println(intList.stream().filter(i -> i < 4).toList());

        intList.stream().filter(i -> i < 4).forEach(i -> System.out.println(i));

        List l2 = intList.stream().filter(i -> i < 4).toList();
        System.out.println(l2);


         /*
        intList.stream().filter(i -> i > 5 && i <=8)
                .forEach(s -> System.out.println(s));

        System.out.println();



        //                    12345678         678
       intList.stream().filter(i -> i <= 8).filter(i -> i > 5)
                .forEach(s -> System.out.println(s));
        System.out.println();

        intList.forEach(e -> System.out.println(e));

        intList = intList.stream().filter(i -> i <= 8).filter(i -> i > 5).toList();

        intList.forEach(e -> System.out.println(e));



        stuff.stream().filter(s -> s.length() == 4)
                .forEach(s -> System.out.println(s));



        List <String> listtest = stuff.stream().filter(s -> s.length() == 4)
                .toList();
        System.out.println();

        listtest.forEach(s -> System.out.println(s));
        System.out.println();

        stuff.stream().filter(s -> s.charAt(0) == 'f')
                .forEach(s -> System.out.println(s));
        System.out.println();

        stuff.stream().filter(s -> s.contains("am"))
                .forEach(s -> System.out.println(s));
        System.out.println(

        );

        List<String> l2 = stuff.stream().filter(s -> s.contains("am"))
                .filter(s -> s.contains("g"))
                 .collect(Collectors.toList());
               // .forEach(s -> System.out.println(s));

               l2.forEach(s -> System.out.println(s));

*/
    }
    
    
    public static void main(String[] args){
        FilterDemo s = new FilterDemo();
    }

}
