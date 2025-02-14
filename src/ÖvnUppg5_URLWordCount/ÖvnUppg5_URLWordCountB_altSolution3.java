package ÖvnUppg5_URLWordCount;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.stream.Collectors;


public class ÖvnUppg5_URLWordCountB_altSolution3 {

    public ÖvnUppg5_URLWordCountB_altSolution3() throws IOException {

        URL url = new URL("https://github.com/dwyl/english-words/blob/master/words.txt?raw=true");

        new BufferedReader(new InputStreamReader(url.openStream()))
                .lines().collect(Collectors.groupingBy(n -> n.length(), Collectors.counting()))   // 3, [aaa, bbb]
                .forEach((k,v) -> System.out.println(k + " " +v));
    }
    
    public static void main(String[] args) throws IOException{
        ÖvnUppg5_URLWordCountB_altSolution3 ö = new ÖvnUppg5_URLWordCountB_altSolution3();
    }
}
