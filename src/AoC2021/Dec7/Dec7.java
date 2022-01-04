package AoC2021.Dec7;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

public class Dec7 {

    public CrabChecker solA = (a,b) ->  Math.abs(a-b);
    public CrabChecker solB = (a, b) -> IntStream.range(0, Math.abs(a-b)+1).sum();

    public int checkCrabs(CrabChecker cc, String path) throws IOException {
        String input = (String) Files.lines(Path.of(path)).toArray()[0];  //allt som en rad
        List<Integer> pos = Arrays.stream(input.split(",")).map(Integer::parseInt).toList();
        int max = pos.stream().mapToInt(e->e).max().getAsInt();
        int min = pos.stream().mapToInt(e->e).min().getAsInt();
        List<List<Integer>> acc = new ArrayList();
        List<Integer> temp;

        for (int i = min; i <= max; i++){
            temp = new ArrayList();
            for (int j = 0; j <pos.size(); j++){
                temp.add(cc.check(i,pos.get(j)));
            }
            acc.add(temp);
        }

        return acc.stream().map(l -> l.stream().mapToInt(e->e).sum()).mapToInt(e->e).min().orElse(0);
    }

    public int checkCrabs2(CrabChecker cc, String path) throws IOException {
        String input = (String) Files.lines(Path.of(path)).toArray()[0];  //allt som en rad
        List<Integer> pos = Arrays.stream(input.split(",")).map(Integer::parseInt).toList();
        int max = pos.stream().mapToInt(e->e).max().getAsInt();
        int min = pos.stream().mapToInt(e->e).min().getAsInt();

        return IntStream.range(min, max).map(i -> pos.stream().map(j-> cc.check(i,j)).mapToInt(e->e).sum()).min().orElse(0);

    }


    Dec7() throws IOException {

        System.out.println(checkCrabs(solA, "src/AoC2021/Dec7/input_mini.txt"));
        System.out.println(checkCrabs(solA, "src/AoC2021/Dec7/input.txt"));
        System.out.println(checkCrabs(solB, "src/AoC2021/Dec7/input_mini.txt"));
        System.out.println(checkCrabs(solB, "src/AoC2021/Dec7/input.txt"));
        System.out.println(checkCrabs2(solA, "src/AoC2021/Dec7/input_mini.txt"));
        System.out.println(checkCrabs2(solA, "src/AoC2021/Dec7/input.txt"));
        System.out.println(checkCrabs2(solB, "src/AoC2021/Dec7/input_mini.txt"));
        System.out.println(checkCrabs2(solB, "src/AoC2021/Dec7/input.txt"));


    }

    public static void main(String[] args) throws IOException {
        Dec7 d = new Dec7();
    }
}
