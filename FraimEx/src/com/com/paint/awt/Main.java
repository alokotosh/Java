package com.com.paint.awt;

import javax.swing.*;
import java.awt.*;

/**
 * Created by kepler23 on 10/15/15.
 */
public class Main {
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                PaintFrame frame = new PaintFrame();
                frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
                frame.setVisible(true);
                frame.setSize(500,600);

            }
        });
    }
}
