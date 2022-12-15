package FilmKod.Streams.StreamsReduce;

import java.util.List;

public class ReduceDemo {

    public ReduceDemo(){
        List<String> members = List.of("Anna", "Bertil", "Cecil", "David", "Elna");
        List<Integer> numbers = List.of(23, 134, 76, 23, 765, 2443, 65, -1, 4, 65, 876, 23);

        System.out.println(numbers.stream().reduce(0, (sum, elem) -> sum + elem));
        System.out.println(numbers.stream().reduce(0, Integer::sum));

        System.out.println(members.stream().reduce("", (str, elem) -> str +" "+ elem));
        System.out.println(members.stream().reduce("", (str, elem) -> str.concat(elem)));
        System.out.println(members.stream().reduce("", String::concat));

    }


    public static void main(String[] args) {
        ReduceDemo m = new ReduceDemo();
    }


}
