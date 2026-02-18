package StringOperatorDemo;

public class SwitchDemo {


    void main(String[] args) {

        String s = IO.readln();

        //Nedanståene SER UT som labdas, men de bygger inte på ett funktionsgränssnitt utan är
        //syntaxtiskt socker för vanliga switch-syntaxen
        String str = switch(s) {
            case "1", "5" -> "en etta eller femma";
            case "2" -> "en tvåa";
            case "3" -> s.repeat(3);
            default -> "något annat";
        };

        IO.println(str);

        //Om man absolut vill få ut olika funktioner ur sin switch är följade möjligt
        //inte helt uppenbart när man kan vilja göra detta, dock
        StringOperator mess =  switch(s) {
            case "1" -> a -> a.toUpperCase();
            case "2" ->a -> a.toLowerCase();
            case "3" -> a -> a.substring(2);
            default -> a -> a.repeat(3);
        };

        IO.println(mess.apply("hejsan svejsan"));

    }
}
