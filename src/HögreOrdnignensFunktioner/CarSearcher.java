package HögreOrdnignensFunktioner;


import java.util.List;
import java.util.Scanner;
import java.util.function.BiPredicate;
import java.util.function.Predicate;

public class CarSearcher {

    CarDAO cd = new CarDAO();
    List<Car> cars = cd.getAllCars();


    CarSearcherInterface regsök = (c, s) -> c.getRegNr().equalsIgnoreCase(s);

    CarSearcherInterface ägarsök = (c, s) -> c.getOwner().equalsIgnoreCase(s);

    CarSearcherInterface färgsök = (c, s) -> c.getColor().equalsIgnoreCase(s);

    BiPredicate p = (c, s) -> ((Car)c).getColor().equalsIgnoreCase((String) s);

//gamla: cars.stream().filter(c -> c.getOwner().equalsIgnoreCase(ägare)).map(Car::getRegnr).toList();
    public List<String> sök (String phrase, CarSearcherInterface cs) {
        return cars.stream().filter(c -> cs.search(c, phrase)).map(Car::getRegnr).toList();
    }

    public List<String> sök2 (String phrase, BiPredicate cs) {
        return cars.stream().filter(c -> cs.test(c, phrase)).map(Car::getRegnr).toList();
    }


    public CarSearcher() {

        Scanner scanner = new Scanner(System.in);
        String term;
        String phrase;

        while (true) {
            System.out.println("Vilken sökterm vill du söka på? (färg, ägare, reg, pred)");
            term = scanner.next();
            System.out.println("Sökord?");
            phrase = scanner.next();

            switch(term) {
                case "färg"-> System.out.println(sök(phrase, (c, s) -> c.getColor().equalsIgnoreCase(s)));
                case "ägare" ->System.out.println(sök(phrase, ägarsök));
                case "reg" ->System.out.println(sök(phrase, regsök));
                case "pred" ->System.out.println(sök2(phrase, p));
                default -> System.out.println("Du måste skriva antingen färg, ägare, reg");
            }

        }

    }

    public static void main(String[] args) {
        CarSearcher searcher = new CarSearcher();
    }

}
