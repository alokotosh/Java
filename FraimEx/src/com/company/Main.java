package com.company;
import com.sun.java.swing.ui.OkCancelButtonPanel;

import javax.swing.JFrame;
import java.awt.*;
import java.util.Formatter;
import java.util.Scanner;


public class Main {
    static Formatter x;
    static Scanner scn;
    public static void main(String[] args) {
	// write your code her
EventQueue.invokeLater(new Runnable() {
                           @Override
                           public void run() {
                               SizedFrame frame = new SizedFrame("Main");
                               frame.toFront();

                               //frame.setUndecorated(true); // отображение без линий и заголовков
                               //frame.setGlassPane(frame);
                               frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                               frame.setVisible(true);
                               frame.setResizable(false);

                               //виводит фрейм поверх других окон

                           }
                       }






);

        String[] fontNames =GraphicsEnvironment
                .getLocalGraphicsEnvironment ()
                .getAvailableFontFamilyNames ();
        for (int i= 0; i <fontNames.length; i++) {
            System.out.println(fontNames[i]);
        }
       // setIcon(image);
//        MainFrame mainFrame = new MainFrame("Count");
//        mainFrame.setVisible(true);
//        mainFrame.setName("My Count");
//        mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//        mainFrame.setSize(300, 300);
//        mainFrame.setResizable(true);
//        mainFrame.setLocationRelativeTo(null);

//        try {
//            x =new Formatter("Files//1.txt");
//            scn = new Scanner(System.in);
//            System.out.println("How old you are?");
//            int a =(int)Double.parseDouble(scn.next());
//
//            System.out.println("What is you name?");
//            String b = scn.next();
//            System.out.println("Where you live?");
//            String c = scn.next();
//            x.format("My name is %s, im %s years old, i'm live in %",b ,a ,c );
//            x.format("%d %s %s", a,b,c);
//           // x.format("asdasdasd");
//           x.locale();
//            x.close();
//
//        } catch (Exception e) {}
//
//
//
   }
}
