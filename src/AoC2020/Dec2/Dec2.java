package AoC2020.Dec2;


import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;
import java.util.stream.Collectors;

public class Dec2 {


    public PasswordChecker checkA = ((password, letter, startRange, stopRange) -> {
        long count = password.chars().filter(c -> c == letter).count();
        return count >= startRange && count <= stopRange;
    });

    public PasswordChecker checkB = ((password, letter, startRange, stopRange) ->
            (password.charAt(startRange-1)==letter)^(password.charAt(stopRange-1)==letter));


    public int checkAllPassports(PasswordChecker checker, String path) throws IOException {
        List<String> input = Files.lines(Path.of(path)).map(l -> l.trim()).toList();

        int counter = 0;
        for (String s : input) {
            String[] parts = s.split("[-: ]");
            if (checker.check(parts[4], parts[2].trim().charAt(0),
                    Integer.parseInt(parts[0]), Integer.parseInt(parts[1])))
                counter++;
        }
        return counter;
    }

    public long checkAllPassports2(PasswordChecker checker, String path) throws IOException {
        return Files.lines(Path.of(path))
                .map(s -> s.trim().split("[-: ]"))
                .filter(x -> checker.check(x[4], x[2].trim().charAt(0),
                        Integer.parseInt(x[0]), Integer.parseInt(x[1])))
                .count();
    }

    public Dec2() throws IOException {
        System.out.println(checkAllPassports(checkA, "src/AoC2020/Dec2/input_mini.txt"));
        System.out.println(checkAllPassports(checkA, "src/AoC2020/Dec2/input.txt"));
        System.out.println(checkAllPassports2(checkA, "src/AoC2020/Dec2/input.txt"));
        System.out.println(checkAllPassports(checkB, "src/AoC2020/Dec2/input_mini.txt"));
        System.out.println(checkAllPassports(checkB, "src/AoC2020/Dec2/input.txt"));
        System.out.println(checkAllPassports2(checkB, "src/AoC2020/Dec2/input.txt"));
    }


    public static void main(String[] args) throws IOException{
        Dec2 d = new Dec2();
    }

}
