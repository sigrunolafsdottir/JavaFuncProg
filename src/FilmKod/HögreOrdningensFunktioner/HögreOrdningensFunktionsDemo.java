package FilmKod.HögreOrdningensFunktioner;

import java.util.List;
import java.util.Scanner;

public class HögreOrdningensFunktionsDemo {

    final CarDAO carDAO = new CarDAO();
    final List<Car> cars = carDAO.getAllCars();
    final Scanner sc = new Scanner(System.in);

    CarSearcherInterface regNrSök = (c, s) ->   c.getRegNr().equalsIgnoreCase(s);

    CarSearcherInterface colorSök = (c, s) ->   c.getColor().equalsIgnoreCase(s);

    CarSearcherInterface ownerSök = (c, s) ->   c.getOwner().equalsIgnoreCase(s);

    CarSearcherInterface modelSök = (c, s) ->   c.getModel().equalsIgnoreCase(s);

    //Högre ordningens funktion!
    public void searchCars(String wordToSearchFor, CarSearcherInterface csi){
        cars.stream().filter(c -> csi.search(c, wordToSearchFor))
                .forEach(c -> System.out.println(c.getData()));
    }

    public HögreOrdningensFunktionsDemo(){

        while(true){
            System.out.println("What attribute do you want to search for");
            final String attributeToSearchFor = sc.nextLine();
            System.out.println("What word do you want to search for");
            final String wordToSearchFor = sc.nextLine();

            if (attributeToSearchFor.equalsIgnoreCase("regnr")){
                searchCars(wordToSearchFor, regNrSök);
            }
            else if (attributeToSearchFor.equalsIgnoreCase("owner")){
                searchCars(wordToSearchFor, ownerSök);
            }
            else if (attributeToSearchFor.equalsIgnoreCase("color")) {
                searchCars(wordToSearchFor, colorSök);
            }
            else{
                searchCars(wordToSearchFor, modelSök);
            }
        }
    }

    public static void main(String[] args) {
        HögreOrdningensFunktionsDemo hofd = new HögreOrdningensFunktionsDemo();
    }
}
