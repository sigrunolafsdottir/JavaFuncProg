package ÖvnUppg5_URLWordCount;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;


public class ÖvnUppg5_URLWordCountB_overlyVerbose {

    public ÖvnUppg5_URLWordCountB_overlyVerbose()  throws IOException {

            URL url = new URL("https://github.com/dwyl/english-words/blob/master/words.txt?raw=true");
            
            BufferedReader words = new BufferedReader(
                    new InputStreamReader(url.openStream()));
            
            Map <Integer, List<String>> letterCountWordListMap    //  3, [aaa, bbb, ccc, ddd]
                    = words.lines()                               //   4, [ffff, wert, dfgh]
                    .collect(Collectors.groupingBy(n -> n.length()));


            Collection<List<String>> wordsOnly = letterCountWordListMap.
                    values();  //  [[aaa, bbb], [ffff]]
            
            Map <Integer, Integer> letterCountMap = wordsOnly.stream()
                    .collect(Collectors
                            .toMap(n -> n.get(0).length(), n -> n.size()));   // 3, 2
                                                                              // 4, 1
            letterCountMap.forEach((k,v) -> System.out.println(k + " " +v));

    }
    
    public static void main(String[] args) throws IOException{
        ÖvnUppg5_URLWordCountB_overlyVerbose ö = new ÖvnUppg5_URLWordCountB_overlyVerbose();
    }
}
