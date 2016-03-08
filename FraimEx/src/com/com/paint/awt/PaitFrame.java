package com.com.paint.awt;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.awt.geom.Line2D;
import java.util.Locale;

/**
 * Created by kepler23 on 10/15/15.
 */

class PaintFrame extends JFrame implements MouseListener,
        MouseMotionListener {

    private JLabel xLabel;
    private JLabel yLabel;
    int x,y;

    PaintFrame()
    {
        setTitle("Paint");
        PaintPanel panel = new PaintPanel();
        add(panel);

        this.addMouseListener(this);
        this.addMouseMotionListener(this);

    }

public void paint(Graphics g)
{
    super.paint(g);

}

    @Override
    public void mouseClicked(MouseEvent e) {


    }

    @Override
    public void mousePressed(MouseEvent e) {
        x = e.getX();
        y = e.getY();
    }

    @Override
    public void mouseReleased(MouseEvent e) {

    }

    @Override
    public void mouseEntered(MouseEvent e) {

    }

    @Override
    public void mouseExited(MouseEvent e) {

    }

    @Override
    public void mouseDragged(MouseEvent e) {
        System.out.println(e.getX() + " " + e.getY());


        Graphics g = getGraphics();
        Graphics2D g2 = null;
       // g.drawLine(e.getX(), e.getY(),x,y);
        g2.draw(new Line2D.Double(0, 0, 30, 40));






    }

    @Override
    public void mouseMoved(MouseEvent e) {


    }

    public class PaintPanel extends JPanel
    {
     PaintPanel() {
         setLayout(new BorderLayout());

        // add(xLabel, BorderLayout.NORTH);



     }
    }
}



