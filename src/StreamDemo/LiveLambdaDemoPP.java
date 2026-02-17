package StreamDemo;

import java.util.ArrayList;
import java.util.List;

public class LiveLambdaDemoPP {


    List<Integer> list = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9);
    List<String> list2 = List.of("röd", "grön", "gul", "svart", "vit");


    void main (){

        list.stream().filter(i -> i<5).forEach(System.out::println);
       // list.stream().filter(i -> i.contains("ö")).forEach(System.out::println);
        System.out.println();

        IO.println(list.stream().filter(i -> i<5).count());


        list2.stream().filter(s -> !s.contains("ö")).forEach(System.out::println);



    }
}
