package FilmKod.Databaser.IntroUppkoppling.CallableDemo;

import java.io.IOException;
import java.util.List;
import java.util.Scanner;

public class CallableStatementDemo {

    public static void main(String[] args) throws ClassNotFoundException, IOException {

        Repository r = new Repository();

        Scanner sc = new Scanner(System.in);
        System.out.println("Skriv in namn på land:");
        String name = sc.nextLine();

        //r.addCountry(name);
        //r.addCountryWOutParam(name);
        r.addCountryWithSelect(name);


    }

}