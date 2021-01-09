package StreamDemo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static java.util.Arrays.asList;


public class ReduceDemo {

    List<String> stuff = new ArrayList<>();

    public ReduceDemo() {
        stuff = Arrays.asList("bike", "card", "dime", 
                "film", "game", "fork", 
                "knife", "spoon", "lame");
        
        List<Integer> intList = asList(1,2,3,4,5,6,7,8,9);

        //summering
        System.out.println(intList.stream()
                  .reduce(0, (acc, number) -> acc + number));

        //konkaternering med aaaa först
        System.out.println(stuff.stream().reduce("aaaa ", (acc, s2) -> acc+=s2+" "));

        //konkaternering av alla ord med "am" i sig
        System.out.println(stuff.stream()
                  .filter(s -> s.contains("am"))
                  .reduce("", (s1, s2) -> s1+=s2));

    }
    
    
    public static void main(String[] args){
        ReduceDemo s = new ReduceDemo();
    }

}
