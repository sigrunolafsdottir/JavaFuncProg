package FilmKod.IntroFP;

public class InteSåFunktionellt {

    int i = 5;

    int adder(){
        i = i +6;  //hemlig mutering av variabel
        return i;
    }

    public InteSåFunktionellt(){
        System.out.println(adder());
        System.out.println(adder());
        System.out.println(adder());
    }

    public static void main(String[] args){
        InteSåFunktionellt t = new InteSåFunktionellt();
    }
}
