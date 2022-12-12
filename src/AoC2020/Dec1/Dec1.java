package AoC2020.Dec1;


import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class Dec1 {

    public int uppgA(String path)  throws IOException{
        List<Integer> input = Files.lines(Path.of(path))
                .map(l -> Integer.parseInt(l.trim()))
                .toList();

        for (int i = 0; i < input.size()-1; i++){
            for (int j = i+1; j < input.size()-1; j++){
                if (input.get(i) + input.get(j) == 2020)
                    return input.get(i) * input.get(j);
            }
        }

        return -1;
    }


    public long uppgA2(String path)  throws IOException{
        List<Integer> input = Files.lines(Path.of(path))
                .map(l -> Integer.parseInt(l.trim()))
                .toList();

        return input.stream().filter(
                i -> input.stream().anyMatch(j -> i + j == 2020)).reduce(1, (acc, nr) -> acc*nr);

    }



    public int uppgB(String path)  throws IOException{
        List<Integer> input = Files.lines(Path.of(path))
                .map(l -> Integer.parseInt(l.trim()))
                .toList();

        for (int i = 0; i < input.size()-1; i++){
            for (int j = i+1; j < input.size()-1; j++){
                for (int k = j+1; k < input.size()-1; k++) {
                    if (input.get(i) + input.get(j) + input.get(k)  == 2020)
                        return input.get(i) * input.get(j) * input.get(k);
                }
            }
        }

        return -1;
    }

    public long uppgB2(String path)  throws IOException{
        List<Integer> input = Files.lines(Path.of(path))
                .map(l -> Integer.parseInt(l.trim()))
                .toList();

        return input.stream().filter(
                i -> input.stream().anyMatch(
                        j -> input.stream().anyMatch(k -> i + j + k == 2020)))
                        .reduce(1, (acc, nr) -> acc*nr);

    }

    public static void main(String[] args) throws IOException{

        AoC2020.Dec1.Dec1 d = new AoC2020.Dec1.Dec1();
        System.out.println("Uppg A, FilmKod.IntroFP.test: " + d.uppgA("src/AoC2020/Dec1/input_mini.txt"));
        System.out.println("Uppg A: " + d.uppgA("src/AoC2020/Dec1/input.txt"));
        System.out.println();
        System.out.println("Uppg A2, FilmKod.IntroFP.test: " + d.uppgA2("src/AoC2020/Dec1/input_mini.txt"));
        System.out.println("Uppg A2: " + d.uppgA2("src/AoC2020/Dec1/input.txt"));
        System.out.println();
        System.out.println("Uppg B, FilmKod.IntroFP.test: " + d.uppgB("src/AoC2020/Dec1/input_mini.txt"));
        System.out.println("Uppg B: " + d.uppgB("src/AoC2020/Dec1/input.txt"));
        System.out.println();
        System.out.println("Uppg B2, FilmKod.IntroFP.test: " + d.uppgB2("src/AoC2020/Dec1/input_mini.txt"));
        System.out.println("Uppg B2: " + d.uppgB2("src/AoC2020/Dec1/input.txt"));

    }

}
