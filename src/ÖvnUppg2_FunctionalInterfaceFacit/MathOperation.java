package ÖvnUppg2_FunctionalInterfaceFacit;


public interface MathOperation {
      int operation(int a, int b);
      
      //uppgift 2b. GÖr inget vettigt
      default MathOperation add(MathOperation m){

          return (i, j) -> m.operation(i, j) + operation(i, j);
      }
   }