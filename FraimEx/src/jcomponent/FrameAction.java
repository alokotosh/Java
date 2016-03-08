package jcomponent;

import javax.swing.*;
import java.awt.event.ActionEvent;

/**
 * Created by kepler23 on 8/28/15.
 */
public class FrameAction extends AbstractAction {
    public  FrameAction(String name)
    {
        super(name);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        System.out.println(getValue(Action.NAME)+ "selected");
    }
}
