package FilmKod.Funktionsgränssnitt.FunctionsAsFirstClassCitizens;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FunctionsAsFirstClassCitizens extends JFrame {

    JPanel p = new JPanel();
    JButton button1 = new JButton("Button 1");
    JButton button2 = new JButton("Button 2");
    JButton button3 = new JButton("Button 3");
    JButton button4 = new JButton("Button 4");

    FunctionsAsFirstClassCitizens(){

        this.add(p);
        p.add(button1);
        p.add(button2);
        p.add(button3);
        p.add(button4);

        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                button1.setText("Pushed 1");
            }
        });

        button2.addActionListener(e -> button2.setText("Pushed 2"));  //passar funktion som parameter

        ActionListener ae = e -> button3.setText("Pushed 3");  //funktioner som variabler
        button3.addActionListener(ae);
        button4.addActionListener(getAE());

        this.setSize(200, 200);
        this.setLocation(1000, 500);
        this.setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    public ActionListener getAE(){
        return e -> button4.setText("Pushed 4");    // returnerar en funktion
    }


    public static void main(String[] args){
        FunctionsAsFirstClassCitizens g = new FunctionsAsFirstClassCitizens();
    }

}
