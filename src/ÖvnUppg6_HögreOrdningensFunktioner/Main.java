package ÖvnUppg6_HögreOrdningensFunktioner;

import java.util.List;
import java.util.Scanner;
import java.util.function.BiPredicate;


public class Main {

    final DAO dao = new DAO();
    final List<Kompis> allakompisar = dao.getAllPersons();

    KompisInterface namnSök = (term, k) -> k.getName().equals(term);
    KompisInterface telefonSök = (term, k) -> k.getPhone().equals(term);

    //vi kan använda javas färdiga, generiska, funktionsgrsänssnitt, funkar också
    BiPredicate<String, Kompis> ageSök = (term, k) -> k.getAge() == Integer.parseInt(term);

    List<Kompis> findFriends (String term, BiPredicate bp){
        return allakompisar.stream().filter(f -> bp.test(term, f)).toList();
    }


    public Main(){

        Scanner sc = new Scanner(System.in);

        while(true) {
            final String searchCategory = sc.nextLine().trim();
            final String searchTerm = sc.nextLine().trim();

            if (searchCategory.equals("name") || searchCategory.equals("namn"))
                findFriends(searchTerm, namnSök).stream().forEach(f -> System.out.println(f.getName()));

            else if (searchCategory.equals("age") || searchCategory.equals("ålder"))
                findFriends(searchTerm, ageSök).stream().forEach(f -> System.out.println(f.getName()));

            else if (searchCategory.equals("phone") || searchCategory.equals("telefon"))
                findFriends(searchTerm, telefonSök).stream().forEach(f -> System.out.println(f.getName()));
        }
    }

    public static void main(String[] args) {
        Main m = new Main();
    }
}
