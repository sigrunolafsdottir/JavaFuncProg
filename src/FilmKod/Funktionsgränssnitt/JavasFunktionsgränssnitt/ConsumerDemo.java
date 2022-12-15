package FilmKod.Funktionsgränssnitt.JavasFunktionsgränssnitt;

import java.util.List;
import java.util.function.Consumer;

public class ConsumerDemo {

    public ConsumerDemo() {

        Consumer c = n -> System.out.println(n);
        c.accept("String");
        c.accept(1);

        List l = List.of("sten", "papper", "sax");
        l.forEach(n -> System.out.println(n));

        l.forEach(new Consumer<String>() {
            @Override
            public void accept(String o) {
                System.out.println(o.toUpperCase());
            }
        });

    }


    public static void main(String[] args) {
        ConsumerDemo j = new ConsumerDemo();
    }
}
