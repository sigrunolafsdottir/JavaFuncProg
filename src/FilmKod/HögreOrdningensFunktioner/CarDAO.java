package FilmKod.HögreOrdningensFunktioner;

import java.util.ArrayList;
import java.util.List;

public class CarDAO {

    private final Car c1 = new Car("QWE123", "Kalle", "Saab", "Röd");
    private final Car c2 = new Car("AAA111",
            "Milla", "Volvo", "blå");
    private final Car c3 = new Car("BBB222",
            "Pelle","Audi", "Gul");
    private final Car c4 = new Car("CCC333",
            "Lotta","Tesla", "svart");
    private final Car c5 = new Car("DDD444",
            "Nisse","Kia", "Silver");

    private final Car c6 = new Car("EEE555",
            "Nisse","Kia", "Silver");

    private final Car c7 = new Car("FFF666",
            "Pelle","Saab", "blå");

    private final List <Car> allCars = new ArrayList<>();

    public CarDAO(){
        allCars.add(c1);
        allCars.add(c2);
        allCars.add(c3);
        allCars.add(c4);
        allCars.add(c5);
        allCars.add(c6);
        allCars.add(c7);
    }

    public List <Car> getAllCars(){
        return allCars;
    }



}
