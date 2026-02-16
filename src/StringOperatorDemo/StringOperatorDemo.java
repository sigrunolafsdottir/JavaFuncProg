package StringOperatorDemo;


public class StringOperatorDemo {
    
    public static void print(StringOperator sp, String s){
        System.out.println(sp.apply(s));
    }

    public static void main(String[] args){
        StringOperator chopLetters = s1 -> s1.substring(2);

        StringOperator manyLines = s -> {
            System.out.println("i lambda");
            return s;
        };

        System.out.println(manyLines.apply("sigrun"));

        StringOperator replaceFirstWithLast = s -> s.replace(s.charAt(0),
                s.charAt(s.length() -1));

        StringOperator upper = s -> s.toUpperCase();

        StringOperator lowerCase = i -> "hej";



/*
        System.out.println(chopLetters.apply("hej"));
        System.out.println(replaceFirstWithLast.apply("hej"));
        System.out.println(upper.apply("hej"));
        System.out.println(lowerCase.apply("HFKENKFKJnkjgkjre"));

        System.out.println(replaceFirstWithLast.apply(chopLetters.apply("luftballong")));


        System.out.println(
                replaceFirstWithLast.apply(chopLetters.apply("flygplan")));

        System.out.println(
                chopLetters.apply(replaceFirstWithLast.apply("flygplan")));

*/
        System.out.println();

        //System.out.println(chopLetters.andThen(replaceFirstWithLast).apply("flygplan"));

        System.out.println(replaceFirstWithLast.andThen(chopLetters).apply("flygplan"));

/*

        final String finalstring = "finalString";

        print(chopLetters, finalstring);

        print(chopLetters, "En jättelång sträng");
        print(replaceFirstWithLast, "En jättelång sträng");
        print(upper, "hejsan hoppsan");


        StringOperator so1 = chopLetters.andThen(replaceFirstWithLast);

        System.out.println(so1.apply("abcde"));

      //  print(freplaceFirstWithLast.andThen(chopLetters), "En jättelångsträng");

        print(chopLetters.andThen(replaceFirstWithLast).andThen(chopLetters), "En jättelångsträng");
*/

    }
}
