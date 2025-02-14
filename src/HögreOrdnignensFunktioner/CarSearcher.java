package HögreOrdnignensFunktioner;


import java.util.List;
import java.util.Scanner;

public class CarSearcher {

    CarDAO cd = new CarDAO();
    List<Car> cars = cd.getAllCars();


    CarSearcherInterface regsök = (c, s) -> c.getRegNr().equalsIgnoreCase(s);

    CarSearcherInterface ägarsök = (c, s) -> c.getOwner().equalsIgnoreCase(s);

    CarSearcherInterface färgsök = (c, s) -> c.getColor().equalsIgnoreCase(s);


    public List<String> sök (String term, CarSearcherInterface cs) {
        return cars.stream().filter(c -> cs.search(c, term)).map(Car::getRegnr).toList();
    }


    public CarSearcher() {

        Scanner scanner = new Scanner(System.in);
        String term;
        String phrase;

        while (true) {
            System.out.println("Vilken sökterm vill du söka på? (färg, ägare, reg)");
            term = scanner.next();
            System.out.println("Sökord?");
            phrase = scanner.next();

            switch(term) {
                case "färg"-> System.out.println(sök(phrase, färgsök));
                case "ägare" ->System.out.println(sök(phrase, ägarsök));
                case "reg" ->System.out.println(sök(phrase, regsök));
                default -> System.out.println("Du måste skriva antingen färg, ägare, reg");
            }

        }

    }

    public static void main(String[] args) {
        CarSearcher searcher = new CarSearcher();
    }

}
