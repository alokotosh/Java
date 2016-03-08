package com.company;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.geom.Rectangle2D;
import java.io.File;
import java.io.IOException;

/**
 * Created by kepler23 on 8/25/15.
 */
public class MyComponents extends JComponent {

    public void paintComponent(Graphics g)
    {

        String filename =  "Files/03z2FlDNBAY.jpg";
        try {
            Image image = ImageIO.read(new File(filename));
            g.drawImage(image, 0, 0,400,533, null) ;
        } catch (IOException e) {
            e.printStackTrace();
        }

        Font ComicSans = new Font("Comic Sans MS", Font.BOLD,14);
        Font sansboldl4 = new Font("SansSerif", Font.BOLD, 14);
        g.setFont(sansboldl4);String message = "Hello, World11";
       // g.drawString(message, 75, 100);
        g.setFont(ComicSans);
     // g.drawString(" HELLO",10,100);




    }

}