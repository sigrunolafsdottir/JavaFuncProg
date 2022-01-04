package StringOperatorDemo;


import java.util.function.Predicate; 
public class PredicateExample { 
    public static void main(String[] args) 
    { 
        // Creating predicate 
        Predicate<Integer> lesserthan18 = i -> (i < 18);
        Predicate<Integer> morethan18 = i -> (i > 18);  
        
        Predicate<String> morethan3Letters = s -> s.length() > 3;
  
        // Calling Predicate method 
        System.out.println(lesserthan18.test(10));
        System.out.println(morethan18.test(10));

        System.out.println(morethan3Letters.test("Lärobok"));

        Predicate<Integer> missionImpossible = 
                lesserthan18.and(morethan18);
        
        Predicate<Integer> almostAlwaysTrue = 
                lesserthan18.or(morethan18);

        System.out.println();
        System.out.println(missionImpossible.test(15));

        System.out.println(almostAlwaysTrue.test(17));


    } 
} 