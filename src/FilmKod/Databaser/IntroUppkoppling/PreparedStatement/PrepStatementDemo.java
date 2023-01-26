package FilmKod.Databaser.IntroUppkoppling.PreparedStatement;

import java.io.IOException;
import java.util.List;
import java.util.Scanner;

public class PrepStatementDemo {

    public static void main(String[] args) throws ClassNotFoundException, IOException {

        Repository r = new Repository();

        Scanner sc = new Scanner(System.in);
        System.out.println("Skriv in namn:");
        String name = sc.nextLine();
        System.out.println("Skriv in adress:");
        String address = sc.nextLine();
        System.out.println("Skriv in landId:");
        int countryId = sc.nextInt();

        r.insertChild(name.trim(), address.trim(), countryId);
        System.out.println("child inserted");

        List<Child> childList = r.getChildByName(name);
        childList.forEach(chil -> System.out.println(chil.getName()+" "+chil.getAddress()));

    }

}