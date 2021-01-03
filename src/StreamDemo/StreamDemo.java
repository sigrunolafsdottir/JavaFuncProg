package StreamDemo;

import java.util.ArrayList;
import java.util.Arrays;
import static java.util.Arrays.asList;
import static java.util.stream.Collectors.toList;

import java.util.List;
import java.util.stream.Collectors;


public class StreamDemo {
    
    List<String> stuff = new ArrayList<>();
    
    public StreamDemo () {
        stuff = Arrays.asList("bike", "card", "dime", 
                "film", "game", "fork", 
                "knife", "spoon", "lame");
        
        List<Integer> intList = asList(1,2,3,4,5,6,7,8,9);
        
        intList.stream().filter(i -> i > 5)
                .forEach(s -> System.out.println(s));
  /*
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


         System.out.println(stuff.stream()
                .map(s -> s.toUpperCase())
                .collect(Collectors.toList()));

         List l22 = stuff.stream().map(s -> s.toUpperCase())
                .collect(Collectors.toList());
         
        stuff.stream().map(s -> s.toUpperCase())
                .forEach(s -> System.out.println(s));
        stuff.stream().map(s -> s.replace('i', 'o'))
                .forEach(s -> System.out.println(s));



        stuff.stream().map(s -> s.replace('i', 'o'))
                .map(s -> s.replace('e', 'a'))
                .forEach(s -> {System.out.println(s);
                System.out.println(s);
                        });


        System.out.println(stuff.stream().anyMatch(s -> s.equals("bike")));
        System.out.println(stuff.stream().anyMatch(s -> s.equals("fsdgfdgdfgfdg")));

        System.out.println(stuff.stream().count());
     
        List<List<String>> deepList = asList(asList("bike", "car"), 
                asList("spoon", "fork", "knife"));
        
        List<List<List<String>>> deepList2 = asList(asList(asList("bike", "car"), 
                asList("spoon", "fork", "knife")));

        System.out.println(deepList2);
        System.out.println(deepList2.stream().
                flatMap(l -> l.stream()).collect(Collectors.toList()));
        System.out.println(deepList2.stream()
                .flatMap(l -> l.stream())
                .flatMap(l3 -> l3.stream()).collect(Collectors.toList()));


          System.out.println(intList.stream()
                  .reduce(0, (total, number) -> total + number));
          System.out.println(stuff.stream().reduce("aaaa", (s1, s2) -> s1+=s2));
          System.out.println(stuff.stream()
                  .filter(s -> s.contains("am"))
                  .reduce("", (s1, s2) -> s1+=s2));


        System.out.println(intList.stream().mapToInt(Integer::intValue).sum());
        System.out.println(intList.stream().mapToInt(i -> i.intValue()).sum());
        System.out.println(intList.stream().mapToInt(e -> e).sum());
        System.out.println(intList.stream().mapToInt(e -> e).max().getAsInt());
        
        List<Double> doubleList = asList(4.9, 5.9);
        System.out.println(doubleList.stream().mapToDouble(Double::intValue).sum());
        System.out.println(doubleList.stream().mapToDouble(e -> e).sum());
            */
        
    }
    
    
    public static void main(String[] args){
        StreamDemo s = new StreamDemo();
    }

}
