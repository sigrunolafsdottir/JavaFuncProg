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


    public void demo() throws IOException {
        String path = "src/AoC2021/Dec1/input.txt";
        List<Integer> input = Files.lines(Path.of(path)).map(Integer::parseInt).toList();

        System.out.println(input);
        int counter = 0;
        for (int i = 0; i < input.size()-1; i++) {
            if (input.get(i) < input.get(i+1)) {
                counter++;
            }
        }
        System.out.println("lösning 1: "+counter);

        System.out.println("lösning 2: "+IntStream.range(0, input.size()-1)
                .filter(i -> input.get(i) < input.get(i+1)).count());



    }













    public int uppgA(String path)  throws IOException{
        List<Integer> input = Files.lines(Path.of(path)).map(Integer::parseInt).toList();


        int counter = 0;
        for (int i = 0; i < input.size()-1; i++){
            if (input.get(i) < input.get(i+1)){
                counter++;
            }
        }
        return counter;
    }

    public long uppgA2(String path)  throws IOException{
        List<Integer> input = Files.lines(Path.of(path)).map(Integer::parseInt).toList();
        //[0,1,2,3,4,5,6, osv]

        return IntStream.range(0, input.size()-1)
                .filter(i ->input.get(i) < input.get(i+1)).count();
    }



    public long uppgA3(String path)  throws IOException{
        List<Integer> input = Files.lines(Path.of(path))
                .map(Integer::parseInt).toList();
        AtomicReference<Integer> test = new AtomicReference(0);

        input.stream().reduce(input.get(0), (a,b) -> {if (b > a ) {
            test.set(test.get() + 1);} return b;});

        return test.get();
    }

    public long uppgB(String path, int winSize)  throws IOException{
        List<Integer> input = Files.lines(Path.of(path))
                .map(Integer::parseInt).toList();

        return IntStream.range(0, input.size()-winSize)
                .filter(i ->input.get(i) < input.get(i+winSize)).count();
    }



    public static void main(String[] args) throws IOException{

        Dec1 d = new Dec1();
        /*
        System.out.println("Uppg A, FilmKod.IntroFP.test: " + d.uppgA("src/AoC2021/Dec1/input_mini.txt"));
        System.out.println("Uppg A: " + d.uppgA("src/AoC2021/Dec1/input.txt"));
        System.out.println();
        System.out.println("Uppg A, FilmKod.IntroFP.test: " + d.uppgA2("src/AoC2021/Dec1/input_mini.txt"));
        System.out.println("Uppg A: " + d.uppgA2("src/AoC2021/Dec1/input.txt"));
        System.out.println();
        System.out.println("Uppg A, FilmKod.IntroFP.test: " + d.uppgA3("src/AoC2021/Dec1/input_mini.txt"));
        System.out.println("Uppg A: " + d.uppgA3("src/AoC2021/Dec1/input.txt"));
        System.out.println();
        System.out.println("Uppg B, FilmKod.IntroFP.test: " + d.uppgB("src/AoC2021/Dec1/input_mini.txt", 3));
        System.out.println("Uppg B: " + d.uppgB("src/AoC2021/Dec1/input.txt", 3));

         */

        d.demo();

    }

}
