package StreamDemo;


import LambdaKataFacit.Person;

import java.util.*;
import java.util.stream.Collectors;
import static java.util.stream.Collectors.groupingBy;
import static java.util.stream.Collectors.partitioningBy;


public class MapDemo {
    
    List<String> names;

    
    public MapDemo() {
        //Initializing lists
        names = Arrays.asList("Anna", "Bertil", "Camilla", 
                "Doris", "Elmer", "Hilma");

        //Skapa en Map rakt av:
        //Map.of skapar en immutable Map
        Map<String, List<String>> colorAssociations1 = Map.of(
                "red", List.of("anger", "blood"),
                "blue", List.of("sky", "sadness", "bluebelles"),
                "yellow", List.of("sun", "sunflowers", "eggyolks")
        );

        //FÖljande kommer att ge fel, pga. immutable
        //colorAssociations1.put("white", List.of("snow"));
        //colorAssociations1.get("red").add("blue");

        System.out.println(colorAssociations1.get("red"));

        System.out.println(colorAssociations1);

        //Another way to crate a map, this one is mutable
        Map<String, List<String>> colorAssociations2 = new HashMap<>();
        colorAssociations2.put("red", new ArrayList<>(List.of("anger", "blood")));
        colorAssociations2.put("blue", new ArrayList<>(List.of("sky", "sadness", "bluebelles")));
        colorAssociations2.put("yellow", new ArrayList<>(List.of("sun", "sunflowers", "eggyolks")));

        colorAssociations2.put("white", List.of("snow"));
        colorAssociations2.get("red").add("tomato");

        System.out.println(colorAssociations2);


        
        //Skapar en map där namnen i names är nycklar och deras längder är värden
        final Map<String, Integer> nameLengthTracker = names.stream()
                .collect(Collectors.toMap(p -> p, n -> n.length()));

        nameLengthTracker.forEach((k,v) -> System.out.println(k +" "+v));

        System.out.println();

        System.out.println(nameLengthTracker.entrySet());
        System.out.println(nameLengthTracker.keySet());
        System.out.println(nameLengthTracker.values());


        System.out.println(nameLengthTracker.get("Anna"));
        System.out.println(nameLengthTracker.get("Annfdsfsfsa"));
        System.out.println(nameLengthTracker.get(4));

        System.out.println(nameLengthTracker.containsKey("Bertil"));
        System.out.println(nameLengthTracker.containsKey("Rulle"));

        System.out.println(nameLengthTracker.containsValue(4));
        System.out.println(nameLengthTracker.containsValue(100));

        System.out.println();
        nameLengthTracker.put("Frideborg", 9);
        System.out.println(nameLengthTracker.entrySet());
        

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
