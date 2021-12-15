package AoC2021.Dec6;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;


public class Dec6 {


    public long uppg(String path, int iter)  throws IOException {
        String input = (String) Files.lines(Path.of(path)).toArray()[0];  //allt som en rad
        var fishes = Arrays.stream(input.split(",")).map(Integer::parseInt).toList();

        List<Long> ls = Arrays.asList(0L,0L,0L,0L,0L,0L,0L,0L,0L);  //här håller vi räkningen
        fishes.forEach(f -> ls.set(f, ls.get(f)+1L));   // placerar in fiskarna

        for (int i = 0; i < iter; i++) {
            Collections.rotate(ls, -1);  //rotera alla värden ett steg åt vänster
            ls.set(6, ls.get(6) + ls.get(8));   //lägg till de fiskar som just spawnat
        }

        return ls.stream().mapToLong(Long::longValue).sum();    //summera
    }


    public static void main(String[] args) throws IOException{

        AoC2021.Dec6.Dec6 d = new AoC2021.Dec6.Dec6();
        System.out.println("Uppg A, test: " + d.uppg("src/AoC2021/Dec6/input_mini.txt", 80));
        System.out.println("Uppg A: " + d.uppg("src/AoC2021/Dec6/input.txt", 80));
        System.out.println();
        System.out.println("Uppg B, test: " + d.uppg("src/AoC2021/Dec6/input_mini.txt", 256));
        System.out.println("Uppg B: " + d.uppg("src/AoC2021/Dec6/input.txt", 256));

    }

}

