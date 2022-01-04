package LambdaParameterDemo;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;


public class ListenerDemo {
   public static void main(String[] args) {
         
     JButton testButton = new JButton("Test Button");
     
     //anonymous class used to define ActionListener
     testButton.addActionListener(new ActionListener(){
        @Override 
        public void actionPerformed(ActionEvent ae){
            System.out.println("Click Detected by Anon Class");
          }
     });

     ActionListener l = e -> System.out.println("hej");

       testButton.addActionListener(l);


       //lambda class used to define ActionListener
     testButton.addActionListener(aevvvvv ->
             System.out.println("Click Detected by Lambda "
                     + "Listner"));
     
     //Lambda used again, but with type declaration for in-parameter
     testButton.addActionListener((ActionEvent ae) ->
             System.out.println("Click Detected by Lambda "
                     + "Listner 2"));
     
     // Swing stuff
     JFrame frame = new JFrame("Listener Test");
     frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
     frame.add(testButton, BorderLayout.CENTER);
     frame.pack();
     frame.setVisible(true);
     
   }
 }
