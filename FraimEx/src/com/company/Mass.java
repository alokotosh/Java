package com.company;

import java.util.Formatter;
import java.util.Scanner;

/**
 * Created by kepler23 on 8/14/15.
 */
public class Mass {


    static Formatter x;
    static Scanner scn;


    public  static void main(String arcs [])
    {
        try {
            x =new Formatter("Files//1.txt");
            scn = new Scanner(System.in);
            System.out.println("How old you are?");
            int a =(int)Double.parseDouble(scn.next());
            System.out.println("What is you name?");
            String b = scn.next();
            System.out.println("Where you live?");
            String c = scn.next();
            x.format("My name is %s, im %d years old, i'm live in %",b,a,c);
            x.close();

        } catch (Exception e) {}



    }
}
