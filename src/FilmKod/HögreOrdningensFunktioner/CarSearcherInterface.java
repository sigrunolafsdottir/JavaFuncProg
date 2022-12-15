package FilmKod.HögreOrdningensFunktioner;

@FunctionalInterface
public interface CarSearcherInterface {
    boolean search(Car c, String searchWord);
}
