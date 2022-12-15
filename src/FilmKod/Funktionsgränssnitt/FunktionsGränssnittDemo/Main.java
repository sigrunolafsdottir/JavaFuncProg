package FilmKod.Funktionsgränssnitt.FunktionsGränssnittDemo;

public class Main {

    public Main(){
        String s1 = "luftballong";
        String s2 = "hejsan svejsan";

        DoThingsWithString dt1 = s -> s.toUpperCase();
        DoThingsWithString dt2 = s -> s.replace('a', 'q').substring(2);

        System.out.println(dt1.apply(s1));
        System.out.println(dt1.apply(s2));

        System.out.println(dt2.apply(s1));
        System.out.println(dt2.apply(s2));

        print (dt1, s2);

        print (s -> s.repeat(4), s2);

        System.out.println(dt1.andThen(dt2).apply(s1));
        System.out.println(dt2.andThen(dt1).apply(s1));

    }

    void print(DoThingsWithString dt, String s){
        System.out.println(dt.apply(s));
    }

    public static void main(String[] args) {
        Main m = new Main();
    }
}
