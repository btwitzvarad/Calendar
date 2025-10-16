import javax.swing.*;

import java.awt.Color;
import java.awt.event.*;
import com.toedter.calendar.JDateChooser;

public class DateSelector implements ActionListener
{    
    JButton b1;

    JDateChooser dateChooser;
    
    DateSelector()
    {
        JFrame f= new JFrame();

        dateChooser = new JDateChooser();
		dateChooser.setBounds(50,50,180,30);
		dateChooser.setForeground(new Color(105, 105, 105));
		f.add(dateChooser);
		
        b1=new JButton("Submit");
        b1.setBounds(100,100,80,30);
        b1.addActionListener(this);	
        f.add(b1);
        
        f.setSize(300,300);
        f.setResizable(false);
        f.setLocationRelativeTo(null);
        f.setLayout(null);
        f.setVisible(true);
    }
    public void actionPerformed(ActionEvent e)
    {
    	String dob = ((JTextField) dateChooser.getDateEditor().getUiComponent()).getText();
		System.out.println(dob);	
    }
    public static void main(String[] args)
    {
    	new DateSelector();
    }
}