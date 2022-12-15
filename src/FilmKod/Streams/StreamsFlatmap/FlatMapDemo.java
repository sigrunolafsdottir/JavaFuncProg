package FilmKod.Streams.StreamsFlatmap;


import java.util.List;

public class FlatMapDemo {

    public FlatMapDemo(){
        List<String> girls = List.of("Anna", "Elna");
        List<String> boys = List.of("Bertil", "Cecil", "David");
        List<List<String>> all = List.of(girls, boys);
        List<Friend> friends = FriendUtil.getFriendList();

        System.out.println(all);
        all.stream().flatMap(l -> l.stream()).forEach(l-> System.out.println(l));

        friends.stream().map(Friend::getPhone).flatMap(p -> p.stream()).forEach(p-> System.out.println(p));

    }

    public static void main(String[] args) {
        FlatMapDemo m = new FlatMapDemo();
    }
}
