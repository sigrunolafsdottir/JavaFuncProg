package StreamDemo;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.groupingBy;
import static java.util.stream.Collectors.partitioningBy;


public class MapPartitioningDemo {

    List<Integer> numbers;


    public MapPartitioningDemo() {

        numbers = Arrays.asList(15, 65, 23, 567, 1, 345, 33, 78,
                976, 1005);

        
        //PartitioningBy, vi delar upp numbers efter vilka nummer som är större eller mindre än 50

        Map<Boolean, List<Integer>> under50 = numbers.stream()
                .collect(partitioningBy(n -> n < 50));

        under50.forEach((k,v) -> System.out.println(k +" "+v));

        System.out.println(under50.get(false));
        System.out.println(" ");
        System.out.println(under50.get(true));

    }

    public static void main(String[] args){
        MapPartitioningDemo s = new MapPartitioningDemo();
    }
}
