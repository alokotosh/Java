package com.calc.lokotosh;

import com.sun.javafx.css.CalculatedValue;

import javax.swing.*;
import java.awt.*;

/**
 * Created by kepler23 on 8/26/15.
 */
public class Main {

    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                CalculatorFrame frame = new CalculatorFrame();
                frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
                frame.setVisible(true);
            }
        });
    }
}
