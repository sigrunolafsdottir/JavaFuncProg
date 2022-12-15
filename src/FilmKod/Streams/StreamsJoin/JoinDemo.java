package FilmKod.Streams.StreamsJoin;

import java.util.List;
import java.util.stream.Collectors;

public class JoinDemo {

    List<String> members = List.of("Nisse", "Rullan", "Cissi", "Fnatte", "Putte", "Mickan", "Lasse");

    public JoinDemo(){

        System.out.println(members.stream().collect(Collectors.joining(", ")));
        System.out.println(members.stream().collect(Collectors.joining(" * ", " # ", " # ")));

    }

    public static void main(String[] args) {
        JoinDemo jd = new JoinDemo();
    }
}
