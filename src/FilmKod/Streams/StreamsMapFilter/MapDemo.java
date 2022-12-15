package FilmKod.Streams.StreamsMapFilter;

import java.util.List;

public class MapDemo {

    public MapDemo(){
        List<String> members = List.of("Anna", "Bertil", "Cecil", "David", "Elna");
        List<Integer> numbers = List.of(23, 134, 76, 23, 765, 2443, 65, -1, 4, 65, 876, 23);
        List<Friend> friends = FriendUtil.getFriendList();

        members.stream().map(f -> f.toUpperCase()).forEach(f -> System.out.println(f));
        System.out.println();

        members.stream().filter(f -> f.length() == 4)
                .map(f -> f.toUpperCase()).forEach(f -> System.out.println(f));

        numbers.stream().map(i -> i+23).distinct().forEach(i -> System.out.println(i));
        System.out.println();

        friends.stream().map(Friend::getAge).forEach(f -> System.out.println(f));
    }

    public static void main(String[] args) {
        MapDemo m = new MapDemo();
    }
}
