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
      //return (i, j) -> m.operation(i, j) + operation(i, j);
      // (10-5)+(10+5) = 20

      //TODO skriv fler exempel där ordningen spelar roll
      MathOperation justTesting = addition.add(subtraction);

      System.out.println("justtesting: "+justTesting.operation(3,4));
      //  (-1) + 7 = 6

      //(i, j) -> operation(m.operation(i,j), operation(i,j));
      MathOperation test2 = addition.doubleUp(subtraction);

      System.out.println(test2.operation(3,4));
      // op (-1, 7) = 6

      // default MathOperation andThen(MathOperation after){
      // return (i, j) -> after.operation(this.operation(i,j), this.operation(i,j));
      MathOperation test3 = addition.andThen(subtraction);

      System.out.println(test3.operation(1,2));

      MathOperation test4 = multiplication.andThen(addition);

      System.out.println(test4.operation(1,2));
		
   }
}
