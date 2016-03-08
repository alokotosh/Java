package com.company;

import javax.swing.*;
import javax.xml.bind.annotation.XmlElement;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by kepler23 on 8/25/15.
 */
public class SizedFrame extends JFrame {




    public void setPerformanceFrame()
    {
        setTitle("Main Frame");
        Toolkit kit = Toolkit.getDefaultToolkit(); //Оприделение размера окна
        Dimension screanSize = kit.getScreenSize(); //Оприделение размера окна
        int screanWight =  screanSize.width;
        int screanHeight =screanSize.height;

        setSize(screanHeight / 2, screanWight / 2);

        setLocationByPlatform(true);  //
        setLocation(500, 0);
       // Image img = kit.createImage("Files/1.jpg");
       // setIconImage(img);

    }


    public void ButtonPerformance()
    {
        JButton BuOkey = new JButton("Okey");
        JButton ВuCancel = new JButton("Cancel");
        JButton ВuSend = new JButton("Send");


       JPanel buttonPanel = new JPanel();
        buttonPanel.add(BuOkey);
        buttonPanel.add(ВuCancel);
        buttonPanel.add( ВuSend);

        add(buttonPanel);

    }


    public SizedFrame(String name)
    {
        //MyComponents components = new MyComponents();
       // add(components);
        setPerformanceFrame();
        ButtonPerformance();
    }

}
