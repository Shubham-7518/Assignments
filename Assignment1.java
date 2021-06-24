
package com.scalive;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Assignment1 extends Frame implements ActionListener {
    Button b1;
    Button b2 ;
    int count;
    public Assignment1(){
        setTitle("Button pressed: "+count);
        setBounds(200,200,400,400);
        setVisible(true);
        b1 = new Button("Close frame");
        b2 = new Button("Increment count");
        FlowLayout fl = new FlowLayout();
        setLayout(fl);
        add(b1);
        add(b2);
        setBackground(Color.LIGHT_GRAY);

        b1.addActionListener(this);
        b2.addActionListener(this);
       
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        if(ae.getSource()== b1)
            System.exit(0);
        else{
           setTitle("Button pressed: "+count++);
        }
            
    } 
}
class UseAssignment1{
    public static void main(String[] args) {
        Assignment1 ex= new Assignment1();
    }
}
