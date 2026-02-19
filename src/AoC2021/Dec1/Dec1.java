package AoC2021.Dec1;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;
import java.util.stream.IntStream;

import static java.util.stream.Collectors.partitioningBy;

public class Dec1 {

   void main() throws IOException {

       String path = "src/AoC2021/Dec1/input.txt";

       List<Integer> input = Files.lines(Path.of(path)).map(Integer::parseInt).toList();

       //System.out.println(input);
       //old school-lösning

       int counter = 0;
       for (int i = 0; i < input.size()-1; i++) {
           if (input.get(i) < input.get(i+1)) {
               counter++;
           }
       }
       IO.println("A: lösning 1: "+counter);

       //Mer funktionenll lösning
       IO.println("A: lösning 2: "+IntStream.range(0, input.size()-1)
               .filter(i -> input.get(i) < input.get(i+1)).count());

       IO.println("B: lösning 2: "+IntStream.range(0, input.size()-3)
               .filter(i ->input.get(i) < input.get(i+3)).count());


    }

}
