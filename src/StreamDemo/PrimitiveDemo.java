package StreamDemo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static java.util.Arrays.asList;


public class PrimitiveDemo {

    List<String> stuff = new ArrayList<>();
    List<Integer> numbers = new ArrayList<>();

    public PrimitiveDemo() {
        
        List<Integer> intList = asList(1,2,3,4,5,6,7,8,9);

        System.out.println(intList.stream().mapToInt(Integer::intValue).sum());
        System.out.println(intList.stream().mapToInt(i -> i.intValue()).sum());
        System.out.println(intList.stream().mapToInt(e -> e).sum());
        System.out.println(intList.stream().mapToInt(e -> e).max().getAsInt());
        
        List<Double> doubleList = asList(4.9, 5.9);
        System.out.println(doubleList.stream().mapToDouble(Double::intValue).sum());
        System.out.println(doubleList.stream().mapToDouble(e -> e).sum());
/*
        numbers = Arrays.asList(15, 65, 23, 567, 1, 345, 33, 78, 976, 1005);

        //SummaryStatistics
        System.out.println(numbers.stream().
                mapToInt(Integer::valueOf).summaryStatistics().getMin());
        System.out.println(numbers.stream().
                mapToInt(Integer::valueOf).summaryStatistics().getCount());
        System.out.println(numbers.stream().
                mapToInt(Integer::valueOf).summaryStatistics().getMax());
        System.out.println(numbers.stream().
                mapToInt(Integer::valueOf).summaryStatistics().getAverage());

        //Vi får en Optional
        System.out.println(numbers.stream().
                mapToDouble(Double::valueOf).min().getAsDouble());

        System.out.println(numbers.stream().
                mapToInt(Integer::valueOf).min().getAsInt());

        //Ger inte en OptionalInt
        System.out.println(numbers.stream().
               mapToInt(Integer::valueOf).sum());
        */
    }
    
    
    public static void main(String[] args){
        PrimitiveDemo s = new PrimitiveDemo();
    }

}
