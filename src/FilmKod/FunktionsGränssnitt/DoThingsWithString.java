package FilmKod.FunktionsGränssnitt;

@FunctionalInterface
public interface DoThingsWithString {
    String apply(String s);


    default DoThingsWithString andThen(DoThingsWithString after){
        return s -> after.apply(apply(s));
    }

}
