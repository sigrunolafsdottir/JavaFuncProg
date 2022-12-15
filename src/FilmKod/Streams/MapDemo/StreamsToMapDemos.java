package FilmKod.Streams.MapDemo;

import FilmKod.Streams.StreamsMapFilter.Friend;
import FilmKod.Streams.StreamsMapFilter.FriendUtil;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.groupingBy;
import static java.util.stream.Collectors.partitioningBy;

public class StreamsToMapDemos {

    List<String> members = List.of("Nisse", "Rullan", "Cissi", "Fnatte", "Putte", "Mickan", "Lars");
    List<Integer> numbers = List.of(23, 134, 76, 23, 765, 2443, 65, -1, 4, 65, 876, 23);
    List<Friend> friends = FriendUtil.getFriendList();
    public StreamsToMapDemos(){

        Map<String, Integer> mMap = members.stream().collect(Collectors.toMap(m->m, m->m.length()));
        mMap.forEach((k,v)-> System.out.println(k+" "+v));

        Map<Integer, List<String>> m2Map = members.stream().collect(groupingBy(n-> n.length()));
        m2Map.forEach((k,v)-> System.out.println(k+" "+v));

        Map<Boolean, List<Integer>> iMap = numbers.stream().collect(partitioningBy(i -> i<50));
        iMap.forEach((k,v)-> System.out.println(k+" "+v));

        Map<String, Friend> fMap = friends.stream().collect(Collectors.toMap(m->m.getName(), m->m));
        fMap.forEach((k,v)-> System.out.println(k+" "+v));
    }


    public static void main(String[] args) {
        StreamsToMapDemos st = new StreamsToMapDemos();
    }
}
