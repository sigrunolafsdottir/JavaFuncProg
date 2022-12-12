package FilmKod.IntroFP;

public class MerFunktionellt {

    final int i = 5;

    int adder(int i){
        return i +6;
    }

    public MerFunktionellt(){
        System.out.println(adder(i));
        System.out.println(adder(adder(i)));
        System.out.println(adder(adder(adder(i))));
    }

    public static void main(String[] args){
        MerFunktionellt t = new MerFunktionellt();
    }
}
