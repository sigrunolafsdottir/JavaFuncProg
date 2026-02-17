package StringOperatorDemo;

public class LiveStringOperatorDemo {

   // String apply(String input);

    public void demoMethod(StringOperator so, String s){
        IO.println(so.apply(s));
    }

    public void main(){

        StringOperator so1 = s -> s.toUpperCase();
        StringOperator so2 = s -> s.substring(2);
        StringOperator so3 = s -> s.repeat(4);

        //IO.println(so1.apply("hejsan svejsan"));
        //IO.println(so2.apply("hejsan svejsan"));

        demoMethod(so1, "flygplan");
        demoMethod(so2, "flygplan");

        demoMethod(x -> x.repeat(4), "flygplan");

        demoMethod(so3.andThen(so2), "hejsansvejsan");
        demoMethod(so2.andThen(so3), "hejsansvejsan");



    }

}
