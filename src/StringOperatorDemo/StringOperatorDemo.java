package StringOperatorDemo;


public class StringOperatorDemo {
    
    public static void print(StringOperator sp, String s){
        System.out.println(sp.apply(s));
    }

    public static void main(String[] args){
        StringOperator chopLetters = s -> s.substring(2);

        StringOperator replaceFirstWithLast = s -> s.replace(s.charAt(0),
                s.charAt(s.length() -1));

        StringOperator upper = s -> s.toUpperCase();
/*
        final String finalstring = "finalString";

        print(chopLetters, finalstring);

        print(chopLetters, "En jättelång sträng");
        print(replaceFirstWithLast, "En jättelång sträng");
        print(upper, "hejsan hoppsan");
*/

        /*
            default StringOperator andThen(StringOperator after){
        return s -> after.apply(this.apply(s));
         */

        StringOperator so1 = chopLetters.andThen(replaceFirstWithLast);
        System.out.println(so1.apply("abcde"));

      //  print(freplaceFirstWithLast.andThen(chopLetters), "En jättelångsträng");

      //  print(chopLetters.andThen(replaceFirstWithLast).andThen(chopLetters), "En jättelångsträng");


    }
}
