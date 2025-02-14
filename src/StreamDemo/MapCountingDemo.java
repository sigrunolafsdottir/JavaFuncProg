package StreamDemo;


import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.partitioningBy;


public class MapCountingDemo {

    List<Integer> numbers;


    public MapCountingDemo() {
        
        //Vi skapar en Map<Integer, Integer> där varje siffra utgör en nyckel och
        // värdet är hur många gånger siffran förekom i orginal-listan.

        List<Integer> numbers = List.of(1, 2, 3, 2, 1, 4, 2, 3, 1, 1, 4, 5);

        Map<Integer, Long> frequencyMap = numbers.stream()
                .collect(Collectors.groupingBy(num -> num, Collectors.counting()));

        System.out.println(frequencyMap);

    }

    public static void main(String[] args){
        MapCountingDemo s = new MapCountingDemo();
    }
}
