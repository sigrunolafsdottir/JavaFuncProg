package AoC2021.Dec2;

import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;


public class Dec2 {

    public void demoA() throws IOException {
        String path = "src/AoC2021/Dec2/input.txt";
        List<String> input = Files.lines(Path.of(path)).toList();

        Map<String, Long> m = input.stream()
                .map(l -> l.split(" "))
                .collect(Collectors.toMap(
                        parts -> parts[0],
                        parts -> Long.parseLong(parts[1]),
                        Long::sum   //om det redan finns ett värde för denna nyckel, vad gör vi med vår nya värdesiffra?
                ));

        System.out.println(m);
        System.out.println((m.get("down")-m.get("up"))*m.get("forward"));
    }





    public static void main(String[] args) throws IOException{

        Dec2 d = new Dec2();

        d.demoA();

    }

}
