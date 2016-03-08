package com.company;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

/**j
 * Created by kepler23 on 8/14/15.
 */
public class MainFrame extends JFrame {
    int t1_int ,t2_int;
    String t1_txt,t2_txt;


    eHandler handler = new eHandler();
    //Button

    JButton b1;
    JButton b2;
    JButton CloseBut;

    //Label
    JLabel l1;
    JLabel l2;
    JLabel l3;
    JLabel l4;

    //TextFeald

    JTextField t1;
    JTextField t2;

    MainFrame(String s)
    {
        super(s);
        setLayout(new FlowLayout());
        b1 = new JButton("Clean");
        b2 = new JButton("Count");
        CloseBut = new JButton("Close");
        l1 = new JLabel("Type your firs number");
        l2 = new JLabel("Type your second number");
        l3 = new JLabel();
        l4 = new JLabel();
        t1= new JTextField(10);
        t2 = new JTextField(10);

        add(b1);
        add(b2);
        add(l1);
        add(l2);
        add(t1);
        add(t2);
        add(l3);
        add(l4);
        add(CloseBut);

        b1.addActionListener(handler);
        b2.addActionListener(handler);

    }

    public class eHandler implements ActionListener
    {
        public void TextCleaner()
        {
            t1.setText(null);
            t2.setText(null);
            l3.setText("");
            l4.setText("");

        }

        public void  InputSource()
        {

            t1_int = Integer.parseInt(t1.getText());
            t2_int = Integer.parseInt(t2.getText());
            t1_int++;
            t2_int++;
            t1_txt = "  " + t1_int;
            t2_txt = "  " + t2_int;
            l3.setText(t1_txt);
            l4.setText(t2_txt);
        }
        @Override
        public void actionPerformed(ActionEvent e) {

            try {
                if (e.getSource() == b2) {
                    InputSource();
                }
                if (e.getSource() == b1) {
                    TextCleaner();
                }
            }
            catch (Exception ex)
            {
                JOptionPane.showMessageDialog(null," Pleas fiend with number");
                TextCleaner();
            }
            try {
                if(e.getSource()==CloseBut)
                {

                }


            }
            catch (Exception ex)
            {

            }


        }
    }
}
