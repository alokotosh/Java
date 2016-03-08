package jcomponent;

import javax.swing.*;
import java.awt.*;

/**
 * Created by kepler23 on 8/27/15.
 */
public class JComponent

{
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                LoginFrame loginFrame = new LoginFrame();
                loginFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                loginFrame.setVisible(true);
            }
        });
    }
}
