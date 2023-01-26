package StringOperatorDemo;

public class IntOperatorDemo {

    public static void print(IntOperator sp, int s){
        System.out.println(sp.apply(s));
    }

    public static void main(String[] args){

        IntOperator intEx = i -> i+3;

        IntOperator intEx2 = i -> {i = 56; return i; };

        final int finalInteger = 5;

        print(intEx, 3);
        print(intEx2, finalInteger);

    }
}
