package jcomponent;

import javax.swing.*;
import javax.swing.JComponent;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

/**
 * Created by kepler23 on 8/27/15.
 */
public class LoginFrame extends JFrame {

    LoginFrame()
    {
        setTitle("Atom");
        setSize(700,300);

        final  JTextField loginField = new JTextField(8);
        final JPasswordField passwordField = new JPasswordField(8);

        JPanel northPanel = new JPanel();
        northPanel.setBackground(Color.lightGray);
//  northPanel.setLayout(new BorderLayout);
        northPanel.add(new JLabel("Login", SwingConstants.RIGHT));
        northPanel.add(loginField);
        northPanel.add(new JLabel("Password ", SwingConstants.RIGHT));
        northPanel.add(passwordField);

        add(northPanel, BorderLayout.NORTH);


        JPanel centerPanel = new JPanel();
        JPanel southPanel = new JPanel();

        JButton loginButton = new JButton("Login");
        JButton singUp = new JButton("Sing Up");
        JButton gestButton = new JButton("Gest");


        centerPanel.add(loginButton);
        add(centerPanel, BorderLayout.CENTER);

        southPanel.add(singUp);
        southPanel.add(gestButton);

        add(southPanel, BorderLayout.SOUTH);

        loginButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JComponentFrame frame = new JComponentFrame();
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                frame.setVisible(true);
                frame.addWindowListener(new WindowAdapter() {
                    @Override
                    public void windowClosing(WindowEvent e) {
                        super.windowClosing(e);
                        int selection = JOptionPane.showConfirmDialog(null, "Do you want exit?", "Title",
                                JOptionPane.OK_CANCEL_OPTION,
                                JOptionPane.WARNING_MESSAGE);
                        if (selection == JOptionPane.OK_OPTION) {
                            System.exit(0);
                        } else {
                            frame.addNotify();
                        }
                    }
                });
                hide();
            }
        });
        singUp.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                SingUpFrame singUpFrame = new SingUpFrame();
                singUpFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                singUpFrame.setVisible(true);

                JMenuBar menuBar = new JMenuBar();

                hide();
            }
        });

        //GroupLayout layout = new GroupLayout(getContentPane());
        //setLayout(layout);
    }
}
