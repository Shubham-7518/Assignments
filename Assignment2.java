
package com.scalive;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class Assignment2 extends Frame implements ActionListener {
    Button b1;
    Button b2;
    Button b3;
    int count;
    public Assignment2(){
        setTitle("Button pressed: "+count);
        setBounds(200,200,400,400);
        setVisible(true);
        b1 = new Button("Close frame");
        b2 = new Button("Increment count");
        b3 = new Button("Decrement count");
        FlowLayout fl = new FlowLayout();
        setLayout(fl);
        setBackground(Color.LIGHT_GRAY);
        add(b1);
        add(b2);
        add(b3);
        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        if(ae.getSource()== b1)
            System.exit(0);
        else if(ae.getSource() == b2){
            count = count+1;
           setTitle("Button pressed: "+count);
        }else{
            count = count-1;
            setTitle("Button pressed: "+count);
        }
            
    } 
}
class UseAssignment2{
    public static void main(String[] args) {
        Assignment2 ex= new Assignment2();
    }
}
