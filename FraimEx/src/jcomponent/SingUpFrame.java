package jcomponent;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by kepler23 on 8/27/15.
 */
public class SingUpFrame extends JFrame {

    SingUpFrame()
    {
        setTitle("Sing Up");
        setSize(800, 300);


        final  JTextField nameField = new JTextField(8);
        final  JTextField loginField = new JTextField(8);
        final  JTextField emailField = new JTextField(8);
        final JPasswordField passwordField = new JPasswordField(10);
        final JPasswordField password2Field = new JPasswordField(10);


        JPanel northPanel = new JPanel();

        northPanel.add(new JLabel("Name", SwingConstants.RIGHT));
        northPanel.add(nameField);
        northPanel.add(new JLabel("Login", SwingConstants.RIGHT));
        northPanel.add(loginField);
        northPanel.add(new JLabel("Email", SwingConstants.RIGHT));
        northPanel.add(emailField);
        northPanel.add(new JLabel("Password 1st check", SwingConstants.RIGHT));
        northPanel.add(passwordField);
       // northPanel.add(new JLabel("Password 2nd check ", SwingConstants.RIGHT));
       // northPanel.add(password2Field);
        //northPanel.setLayout();
        add(northPanel, BorderLayout.CENTER);


        JPanel centerPanel = new JPanel();
        JButton singUp = new JButton("Sing Up");

        centerPanel.add(singUp);
        add(centerPanel, BorderLayout.SOUTH);

        singUp.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                JComponentFrame frame = new JComponentFrame();
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                frame.setVisible(true);
                hide();
            }
        });








    }
}
