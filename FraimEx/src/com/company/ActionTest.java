package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;

/**
 * Created by kepler23 on 8/25/15.
 */
public class ActionTest {

    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                ActionFrame frame = new ActionFrame();
                frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
                frame.setVisible(true);

            }
        });
    }
}
class ActionFrame extends JFrame
{
    public ActionFrame ()
    {
        setTitle("ActionFrame");
        setSize(500,700);
        buttonPanel = new JPanel();


 //Определения действий
        Action yellowAction =
                new ColorAction("Yellow",  Color.yellow);
        Action blueAction =
                new ColorAction("Blue",  Color.blue);
        Action redAction =
                new ColorAction("Red", Color.red);


        //Добавление кнопок для дейстрвий
        buttonPanel.add(new JButton(yellowAction));
        buttonPanel.add(new JButton(blueAction));
        buttonPanel.add(new JButton(redAction));

        //добавление панели к фрейму
        add(buttonPanel);



//Связивание клавиш Y B R  с именем
        InputMap imap = buttonPanel.getInputMap(JComponent.WHEN_ANCESTOR_OF_FOCUSED_COMPONENT);
        imap.put(KeyStroke.getKeyStroke("crt y"),"panel.yellow");
        imap.put(KeyStroke.getKeyStroke("crt b"), "panel.blue");
        imap.put(KeyStroke.getKeyStroke("crt r"),"panel.red");

        //cвязивание имени с действием

        ActionMap amap = buttonPanel.getActionMap();
        amap.put("panel.yellow",yellowAction);
        amap.put("panel.blue",blueAction);
        amap.put("panel.red",redAction);



    }
    class ColorAction extends AbstractAction
    {

        public  ColorAction(String name, Color c)
        {
            //Создание действий для изменения цвета
            putValue(Action.NAME, name);

            putValue(Action.SHORT_DESCRIPTION, "Set panel color to"+name.toLowerCase());
            putValue("color ", c);
        }
        @Override
        public void actionPerformed(ActionEvent e) {

            Color c = (Color) getValue("color");
            buttonPanel.setBackground(c);
        }
    }



    private  JPanel    buttonPanel;
}


