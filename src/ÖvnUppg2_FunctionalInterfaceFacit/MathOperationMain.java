package ÖvnUppg2_FunctionalInterfaceFacit;


public class MathOperationMain {

   //Exempel på hur Funktionsgränssnitt kan skickas som parametrar
   private static int operate(int a, int b, MathOperation mathOperation) {
      return mathOperation.operation(a, b);
   }
    
   public static void main(String args[]) {

      int test = 4;

      MathOperation addition = (a, b) -> a + b;
		
      MathOperation subtraction = (a, b) -> a - b;
		
      //bara för att demonstrera giltig kod, tilldelningen av j tillför inget
      //med krullparanteser måste man ha en explicit return
      MathOperation multiplication = (int a, int b) 
              -> { int j = 5;
              return a * b; };
		
      MathOperation division = (a,  b) -> a / b;

      System.out.println(addition.operation(1,2));
      System.out.println(subtraction.operation(1,2));
      System.out.println(multiplication.operation(1,2));
      System.out.println(division.operation(1,2));
		
      System.out.println("10 + 5 = " + operate(10, 5, addition));
      System.out.println("10 - 5 = " + operate(10, 5, subtraction));
      System.out.println("10 x 5 = " + operate(10, 5, multiplication));
      System.out.println("10 / 5 = " + operate(10, 5, division));

      
      //Uppgift 2b
      //MathOperation addition = (a, b) -> a + b;
      //MathOperation subtraction = (a, b) -> a - b;
      //(i, j) -> m.operation(i, j) + operation(i, j);
      // (10-5)+(10+5) = 20
      MathOperation justTesting = addition.add(subtraction);
      System.out.println(justTesting.operation(10,5));
		
   }
}
