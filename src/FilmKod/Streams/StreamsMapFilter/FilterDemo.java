package FilmKod.Streams.StreamsMapFilter;

import java.util.List;


public class FilterDemo {

    public FilterDemo(){
        List<String> members = List.of("Anna", "Bertil", "Cecil", "David", "Elna");
        List<Integer> numbers = List.of(23, 134, 76, 23, 765, 2443, 65, -1, 4, 65, 876, 23);
        List<Friend> friends = FriendUtil.getFriendList();

        members.stream().filter(m -> m.contains("na")).forEach(m -> System.out.println(m));

        System.out.println(members.stream().filter(m -> m.contains("na")).count());

        List naMambers = members.stream().filter(m -> m.contains("na")).toList();
        System.out.println(naMambers);

        numbers.stream().filter(n -> n > 100 && n < 1000).forEach(n -> System.out.println(n));

        friends.stream().filter(f -> f.getAddress().equals("Xvägen")).forEach(f -> System.out.println(f.getName()));

    }


    public static void main(String[] args) {
        FilterDemo m = new FilterDemo();
    }
}
