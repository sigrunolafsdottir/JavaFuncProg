package FilmKod.StreamsPrimitives;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

public class PrimitivesDemo {

    public PrimitivesDemo(){

        List<String> members = List.of("Anna", "Bertil", "Cecil", "David", "Elna");
        List<Integer> numbers = List.of(23, 134, 76, 23, 765, 2443, 65, -1, 4, 65, 876, 23);
        List<Integer> empty = new ArrayList<>();
        int[] intArray = {2,34,56,7,43,5453,54,3};

        System.out.println(numbers.stream().mapToInt(i -> i).sum());
        System.out.println(numbers.stream().mapToInt(i -> i).max().getAsInt());
        System.out.println(numbers.stream().mapToInt(i -> i).average().getAsDouble());

        System.out.println(members.stream().map(n -> n.length()).mapToInt(i -> i).filter(i -> i <= 4).count());

        System.out.println(empty.stream().mapToInt(i -> i).max().orElse(0));

        System.out.println(IntStream.of(4,3,2).max().orElse(0));

        System.out.println(Arrays.stream(intArray).max().orElse(0));

    }

    public static void main(String[] args) {
        PrimitivesDemo pd = new PrimitivesDemo();
    }
}
