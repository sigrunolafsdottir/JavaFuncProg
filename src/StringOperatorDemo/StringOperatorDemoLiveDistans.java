package StringOperatorDemo;

public class StringOperatorDemoLiveDistans {

    //  String apply(String input);

    public void stringOperatorDemo(StringOperator someStringOperator, String s) {
        IO.println(someStringOperator.apply(s));
    }


    void main () {

        StringOperator s1 = s -> s.toUpperCase();
        StringOperator s2 = s -> s.substring(2);

        String test = "flygplan";
        String test2 = "luftballong";

        IO.println(s1.apply(test));
        IO.println(s2.apply("hejsan"));


        stringOperatorDemo(s1, test2);
        stringOperatorDemo(s -> s.substring(2), test2);
        stringOperatorDemo(s -> s.substring(5), test2);
        stringOperatorDemo(s -> s.toUpperCase(), test2);

    }


}
