package HögreOrdnignensFunktioner;

import java.util.List;
import java.util.Scanner;

public class CarSearcherNoHOF {

    CarDAO cd = new CarDAO();
    List<Car> cars = cd.getAllCars();

    public List<String> färgSök (String färg) {
        return cars.stream().filter(c -> c.getColor().equalsIgnoreCase(färg)).map(Car::getRegnr).toList();
    }

    public List<String> regSök (String reg) {
        return cars.stream().filter(c -> c.getRegNr().equalsIgnoreCase(reg)).map(Car::getRegnr).toList();
    }

    public List<String> ägarSök (String ägare) {
        return cars.stream().filter(c -> c.getOwner().equalsIgnoreCase(ägare)).map(Car::getRegnr).toList();
    }

    public CarSearcherNoHOF() {

        Scanner scanner = new Scanner(System.in);
        String term;
        String phrase;

        while (true) {
            System.out.println("Vilken sökterm vill du söka på? (färg, ägare, reg)");
            term = scanner.next();
            System.out.println("Sökord?");
            phrase = scanner.next();

            switch(term) {
                case "färg"-> System.out.println(färgSök(phrase));
                case "ägare" ->System.out.println(ägarSök(phrase));
                case "reg" ->System.out.println(regSök(phrase));
                default -> System.out.println("Du måste skriva antingen färg, ägare, reg");
            }

        }

    }

    public static void main(String[] args) {
        CarSearcherNoHOF searcher = new CarSearcherNoHOF();
    }

}
