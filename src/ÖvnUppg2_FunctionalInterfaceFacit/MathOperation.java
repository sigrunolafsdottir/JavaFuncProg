package ÖvnUppg2_FunctionalInterfaceFacit;


public interface MathOperation {
      int operation(int a, int b);
      
      //uppgift 2b. GÖr inget vettigt
    //MathOperation justTesting = addition.add(subtraction);
      default MathOperation add(MathOperation m){

          return (i, j) -> m.operation(i, j) + operation(i, j);
      }

      default String test(Integer i){
          return "hej";
      }
   }