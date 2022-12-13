package FilmKod.StreamsSorting;

import FilmKod.StreamsMapFilter.Friend;
import FilmKod.StreamsMapFilter.FriendUtil;

import java.text.Collator;
import java.util.Comparator;
import java.util.List;
import java.util.Locale;

public class SortingDemo {

    List<String> members = List.of("Nisse", "Rullan", "Cissi", "Fnatte", "Putte", "Mickan", "Lasse");
    List<String> students = List.of("nisse", "Åke", "Cissi", "fnatte", "Östen", "Mickan", "Ärling");
    List<Integer> numbers = List.of(23, 134, 76, 23, 765, 2443, 65, -1, 4, 65, 876, 23);
    List<Friend> friends = FriendUtil.getFriendList();
    Collator c = Collator.getInstance(new Locale("sv", "SE"));


    public SortingDemo() {

        numbers.stream().sorted().forEach(System.out::println);
        System.out.println();
        numbers.stream().sorted(Comparator.reverseOrder()).forEach(System.out::println);

        members.stream().sorted().forEach(System.out::println);
        System.out.println();
        students.stream().sorted(c).forEach(System.out::println);
        System.out.println();

        friends.stream().sorted((a1, a2) -> ((Integer)a1.getAge()).compareTo(a2.getAge()))
                .forEach(a -> System.out.println(a.getName()));

        friends.stream().map(Friend::getAge).sorted().forEach(System.out::println);
    }

    public static void main(String[] args) {
        SortingDemo s = new SortingDemo();
    }

}
