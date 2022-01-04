package StringOperatorDemo;


public class StringOperatorDemo {
    
    public static void print(StringOperator sp, String s){
        System.out.println(sp.apply(s));
    }

    public static void main(String[] args){
        StringOperator f1 = s -> s.substring(2);
        StringOperator f2 = s -> s.replace(s.charAt(0),
                s.charAt(s.length() -1));

        StringOperator f3 = s -> s.toUpperCase();
/*
        print(f1, "En jättelång sträng");
        print(f2, "En jättelång sträng");
        print(f3, "hejsan hoppsan");

        print(s -> s.substring(2), "En jättelång sträng");
        print(s -> s.replace(s.charAt(0), 
                s.charAt(s.length() -1)), 
                "En jättelång sträng");
        System.out.println();

        String test = f1.apply("Hej");
        System.out.println(test);
*/

        print(f1.andThen(f2), "En jättelångsträng");
        print(f1.andThen(f2).andThen(f1), "En jättelångsträng");
        print(f2.andThen(f1), "En jättelångsträng");

        //gättelångsträng
//ättelångsträng
// jättelångsträng

    }
}
