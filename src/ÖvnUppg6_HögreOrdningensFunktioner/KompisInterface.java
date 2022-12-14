package ÖvnUppg6_HögreOrdningensFunktioner;


import java.util.function.BiPredicate;


//BiPredicate är generiskt
//Här ärver jag det, men specar vilka typer jag ska ha på mina inparametrar och "låser" på så sätt typen
//KompisInterfaces abstrakta metod blir: boolean test(String s, Kompis k)
//Det är helt valfritt att köra KompisInterface eller BiPredicate

@FunctionalInterface
public interface KompisInterface extends BiPredicate<String, Kompis> {}
