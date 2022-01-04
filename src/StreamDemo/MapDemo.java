package StreamDemo;


import LambdaKataFacit.Person;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import static java.util.stream.Collectors.groupingBy;
import static java.util.stream.Collectors.partitioningBy;


public class MapDemo {
    
    List<String> names;

    
    public MapDemo() {
        //Initializing lists
        names = Arrays.asList("Anna", "Bertil", "Camilla", 
                "Doris", "Elmer", "Hilma");
        
        //Skapar en map där namnen i names är nycklar och deras längder är värden
        Map<String, Integer> nameLengthTracker = names.stream()
                .collect(Collectors.toMap(p -> p, n -> n.length()));

        nameLengthTracker.forEach((k,v) -> System.out.println(k +" "+v));

        System.out.println(nameLengthTracker.entrySet());
        System.out.println(nameLengthTracker.keySet());
        System.out.println(nameLengthTracker.values());


        System.out.println(nameLengthTracker.get("Anna"));

        System.out.println(nameLengthTracker.containsKey("Bertil"));
        System.out.println(nameLengthTracker.containsKey("Rulle"));

        System.out.println(nameLengthTracker.containsValue(4));
        System.out.println(nameLengthTracker.containsKey(100));


        nameLengthTracker.put("Frideborg", 9);
        

        System.out.println();
        //vi gör replaceAll på värdena tar minus 1
        nameLengthTracker.replaceAll((k,v) -> k.substring(1).length());
        nameLengthTracker.forEach((k,v) -> System.out.println(k +" "+v));
        System.out.println();

        //Med compute ändrar vi ett av värdena till valfritt värde
        nameLengthTracker.compute("Anna", (k, v) -> 100);
        nameLengthTracker.forEach((k,v) -> System.out.println(k +" "+v));

    }

    public static void main(String[] args){
        MapDemo s = new MapDemo();
    }
}
