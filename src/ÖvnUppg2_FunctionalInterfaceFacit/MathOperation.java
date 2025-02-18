package ÖvnUppg2_FunctionalInterfaceFacit;


import StringOperatorDemo.StringOperator;

public interface MathOperation {
      int operation(int a, int b);






      //uppgift 2b. GÖr inget vettigt
    //MathOperation justTesting = addition.add(subtraction);
      default MathOperation add(MathOperation m){
          return (i, j) -> m.operation(i, j) + operation(i, j);
      }

      default MathOperation doubleUp(MathOperation m){
          return (a, b) -> operation(m.operation(a,b), operation(a,b));
    }

      default String test(Integer i){
          return "hej";
      }


        default MathOperation andThen(MathOperation after){
            return (i, j) -> after.operation(operation(i,j), operation(i,j));
    }

}