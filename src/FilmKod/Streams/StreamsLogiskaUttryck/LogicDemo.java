package FilmKod.Streams.StreamsLogiskaUttryck;

import java.util.List;

public class LogicDemo {

    List<String> members = List.of("Anna", "Bertil", "Cecil", "David", "Elna");
    List<Integer> numbers = List.of(23, 134, 76, 23, 765, 2443, 65, -1, 4, 65, 876, 23);

    public LogicDemo(){
        System.out.println(members.stream().anyMatch(m -> m.length()>5));
        System.out.println(members.stream().allMatch(m -> m.length()>5));
        System.out.println(members.stream().allMatch(m -> m.length()>3));

        System.out.println(members.stream().filter(m -> m.contains("na")).findAny().get());
        System.out.println(members.stream().filter(m -> m.contains("na")).findFirst().get());


    }

    public static void main(String[] args) {
        LogicDemo ld = new LogicDemo();
    }
}
