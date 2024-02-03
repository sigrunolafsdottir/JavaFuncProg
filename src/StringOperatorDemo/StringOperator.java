package StringOperatorDemo;


public interface StringOperator {

    String apply(String input);

    default StringOperator andThen(StringOperator after){
        return s -> after.apply(this.apply(s));
    }




    default StringOperator andThen2(StringOperator after){
        return s -> {
            String temp = this.apply(s);
            String temp2 = after.apply(temp);
            return temp2;
        };
    }


}
