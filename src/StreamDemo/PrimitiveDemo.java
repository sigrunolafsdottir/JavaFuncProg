package StreamDemo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static java.util.Arrays.asList;


public class PrimitiveDemo {


    public PrimitiveDemo() {
        
        List<Integer> intList = asList(1,2,3,4,5,6,7,8,9);

        System.out.println(intList.stream().mapToInt(Integer::intValue).sum());
        System.out.println(intList.stream().mapToInt(i -> i.intValue()).sum());
        System.out.println(intList.stream().mapToInt(e -> e).sum());

        List<Double> doubleList = asList(4.9, 5.9);
        System.out.println(doubleList.stream().mapToDouble(Double::intValue).sum());  //floorar doubles
        System.out.println(doubleList.stream().mapToDouble(e -> e).sum());

        System.out.println();

        List<Integer> numbers = Arrays.asList(15, 65, 23, 567, 1, 345, 33, 78, 976, 1005);

        //SummaryStatistics
        System.out.println(numbers.stream().
                mapToInt(Integer::valueOf).summaryStatistics().getMin());
        System.out.println(numbers.stream().
                mapToInt(Integer::valueOf).summaryStatistics().getSum());
        System.out.println(numbers.stream().
                mapToInt(Integer::valueOf).summaryStatistics().getCount());
        System.out.println(numbers.stream().
                mapToInt(Integer::valueOf).summaryStatistics().getMax());
        System.out.println(numbers.stream().
                mapToInt(Integer::valueOf).summaryStatistics().getAverage());

        System.out.println();



        //Optional
        List<Integer> emptyList = asList();

        System.out.println(emptyList.stream().
                mapToInt(Integer::valueOf).summaryStatistics().getMin());
        System.out.println(emptyList.stream().
                mapToInt(Integer::valueOf).summaryStatistics().getMax());
        System.out.println(emptyList.stream().
                mapToInt(Integer::valueOf).summaryStatistics().getSum());

        System.out.println();
        System.out.println(intList.stream().mapToInt(e -> e).max());
        System.out.println(intList.stream().mapToInt(e -> e).max().getAsInt());
        System.out.println(emptyList.stream().mapToInt(e -> e).max());
        System.out.println(emptyList.stream().mapToInt(e -> e).max().orElse(0));
        System.out.println(emptyList.stream().mapToInt(e -> e).max().getAsInt());
        //System.out.println(emptyList.stream().mapToInt(e -> e).max().getAsInt().orElse(0));
        //System.out.println(emptyList.stream().mapToInt(e -> e).max().orElse(0).getAsInt());


    }
    
    
    public static void main(String[] args){
        PrimitiveDemo s = new PrimitiveDemo();
    }

}
