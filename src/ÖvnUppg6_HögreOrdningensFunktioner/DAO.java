package ÖvnUppg6_HögreOrdningensFunktioner;


import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class DAO {

    private final Kompis Anna = new Kompis("Anna", "Kungsgatan 12, 12456 Stockholm",
            "43353453", 34);
    private final Kompis Bertil = new Kompis("Bertil",
            "Drottninggatan 3 12, 1226 Stockholm","765757575", 34);
    private final Kompis Cecil = new Kompis("Cecil",
            "Allgatan 12, 12456 Stockholm","87655464564", 55);
    private final Kompis Danne = new Kompis("Danne",
            "Betgatan 12, 12456 Stockholm","4353454645", 43);
    private final Kompis Ella = new Kompis("Ella",
            "Cevgatan 12, 12456 Stockholm","9876554", 26);

    private final Kompis Ella2 = new Kompis("Ella",
            "Cevgatan 12, 12456 Stockholm","12345", 43);

    private final List<Kompis> allPersons = new ArrayList<>();

    public DAO(){
        allPersons.add(Anna);
        allPersons.add(Bertil);
        allPersons.add(Cecil);
        allPersons.add(Danne);
        allPersons.add(Ella);
        allPersons.add(Ella2);
    }

    public List<Kompis> getAllPersons(){
        return allPersons;
    }

}
