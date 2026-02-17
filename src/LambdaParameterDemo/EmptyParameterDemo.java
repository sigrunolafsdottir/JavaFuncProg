package LambdaParameterDemo;

public class EmptyParameterDemo {

    public static void main(String[] args) {
           
    // Anonymous Runnable
     Runnable r1 = new Runnable(){
            @Override
            public void run(){
              System.out.println("Hello world one!");
            }
     };
     
     // Lambda Runnable
     Runnable r2 = () -> System.out.println("Hello world three!");
     
     // Run em!
     Thread t1 = new Thread(r1);
     Thread t2 = new Thread(() -> System.out.println("Hello world two lambda!"));
     Thread t3 = new Thread(r2);
     t1.start();
     t2.start();
     t3.start();
   }
 }
