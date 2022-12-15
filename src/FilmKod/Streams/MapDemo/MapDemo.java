package FilmKod.Streams.MapDemo;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MapDemo {

    public MapDemo(){

        Map<String, List<String>> phoneNumbers = new HashMap<>();
        phoneNumbers.put("sigrun", List.of("123435", "6546464", "6547657"));
        phoneNumbers.put("mats", List.of("765453", "2534645", "23546"));
        phoneNumbers.put("skravlan", List.of("645765", "76543", "364576"));

        phoneNumbers.forEach((k, v) -> System.out.println(k+" "+v));
        System.out.println(phoneNumbers.keySet());
        System.out.println(phoneNumbers.values());

        System.out.println(phoneNumbers.containsKey("sigrun"));
        System.out.println(phoneNumbers.containsKey("gdffh"));

        phoneNumbers.put("skravlan", List.of("1111111"));
        phoneNumbers.put("doris", List.of("22222"));
        phoneNumbers.forEach((k, v) -> System.out.println(k+" "+v));

        System.out.println(phoneNumbers.entrySet());


    }

    public static void main(String[] args) {
        MapDemo mp = new MapDemo();
    }
}
