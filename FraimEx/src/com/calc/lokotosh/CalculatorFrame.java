package com.calc.lokotosh;

import javax.swing.*;
import javax.swing.text.DefaultEditorKit;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Locale;
import java.util.jar.JarEntry;

/**
 * Created by kepler23 on 8/26/15.
 */
public class CalculatorFrame extends JFrame {



   // private JButton display;
   //private  JTextArea display;
    private  JTextField display;


    private JPanel panel;
    private  JTextArea TexArea;
    private double result;
    private String lastCommand;
    private boolean start;


    public  CalculatorFrame()
    {

        setTitle("Calculator");
        CalculatorPanel cPanel = new CalculatorPanel();
        add(cPanel);
        setLocation(500, 100);
        pack();
        System.out.println(Thread.currentThread().getName());

    }
    public class CalculatorPanel extends  JPanel
    {
   public  CalculatorPanel()
   {
       setLayout(new BorderLayout());
       result =0;
       start =true;
       lastCommand = "=";

       //Add Elements for display result

       display = new JTextField(" ");
       display.setSize(500,200);
       display.setEnabled(true);
       add(display, BorderLayout.NORTH);

       ActionListener insert  = new InsertAction();
       ActionListener command = new CommandAction();
       ActionListener commandC = new CommandClearAction();

       //Размещение сетки в виде 4 на 4
       panel = new JPanel();
       panel.setLayout(new GridLayout(5, 4,5,2));

       addButton("MC", insert);
       addButton("MV", insert);
       addButton("MK", insert);
       addButton("C", commandC);


       addButton("7", insert);
       addButton("8", insert);
       addButton("9", insert);
       addButton("/", command);

       addButton("4", insert);
       addButton("5", insert);
       addButton("6", insert);
       addButton("*", command);

       addButton("1", insert);
       addButton ("2", insert);
       addButton("3", insert);
       addButton("-", command);

       addButton ("0", insert);
       addButton(".", insert);
       addButton("=", command);
       addButton("+", command);
       add(panel, BorderLayout.CENTER);
   }
        /* *
         *
          * Добавление кнопки к централбной панели
          * Добавление слушетиля кнопки
          *
          *
          *

          * */
private  void addButton(String label, ActionListener listener)
{
    JButton button = new JButton(label);
            button.addActionListener(listener);
            panel.add(button);

}
    }


/** .
 * При обработке события строка, связанная с кнопкой,
 * помещается в конец отображаемого текста.
 */
    private class  InsertAction implements  ActionListener {
    @Override
    public void actionPerformed(ActionEvent event) {
        String input = event.getActionCommand();

        if(start)
        {
            display.setText("");
            start = false;

        }
        display.setText(display.getText() + input);
       }

}
    private class  CommandAction implements  ActionListener {
        @Override
        public void actionPerformed(ActionEvent event) {
            String  command = event.getActionCommand();

            if(start)
            {
                if(command.equals("-"))
                {
                    display.setText(command);
                    start = false;
                }
                else lastCommand=command;

            } else

            {
                calculate(Double.parseDouble(display.getText()));
                lastCommand =command;
                start =true;

            }
        }
    }

    private class  CommandClearAction implements  ActionListener {
        @Override
        public void actionPerformed(ActionEvent event) {
            String  commandC = event.getActionCommand();

            if(start)
            {
                display.setText("");
                start = false;
            }
            display.setText(" ");
        }
    }

    public  void calculate(double x)
    {
        if (lastCommand.equals("+")) result +=x;
        else if (lastCommand.equals("-")) result -=x;
        else if (lastCommand.equals("*")) result *=x;
        else if (lastCommand.equals ("/")) result /= x;
    else if (lastCommand.equals("=")) result  =x;
        display.setText("" + result);

    }


}
