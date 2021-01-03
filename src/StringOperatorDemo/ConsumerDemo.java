package StringOperatorDemo;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;


public class ConsumerDemo {

    
    public static void main(String[] args) {
        Consumer n = t -> System.out.println(t+" "+t);
        //Vi matar konsumenten direkt med "Hej", utan att gå via foreach
        n.accept("Hej"); 
/*
        List<String> l = new ArrayList<>();
        l.add("aaaa");
        l.add("bbbb");

        l.forEach(e -> System.out.println(e));
        System.out.println();

        l.forEach(n);
        System.out.println();

        //Specialare
        // :: låter oss referera en metod hos en klass
        l.forEach(System.out::println);
*/
    }


}
