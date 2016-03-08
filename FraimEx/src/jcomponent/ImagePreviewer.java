package jcomponent;

import javax.swing.*;
import java.awt.*;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.io.File;

/**
 * Created by kepler23 on 8/31/15.
 */
public class ImagePreviewer extends JLabel {

    public  ImagePreviewer(JFileChooser chooser)
    {
        setPreferredSize(new Dimension(100,100));
        setBorder(BorderFactory.createEtchedBorder());
        chooser.addPropertyChangeListener(new PropertyChangeListener() {
            @Override
            public void propertyChange(PropertyChangeEvent evt) {
              if(evt.getPropertyName() ==
                      JFileChooser.SELECTED_FILE_CHANGED_PROPERTY)
              {
                    //User selected new file
                  File f =(File)evt.getNewValue();
                  if (f==null)
                  {
                    setIcon(null);
                      return;
                  }
                  // Reading image use as pictogram
                  ImageIcon icon = new ImageIcon(f.getPath());
                  //маштабирование большой пиктограми
                  if(icon.getIconWidth() > getWidth())
                  {
                      icon = new ImageIcon(icon.getImage().getScaledInstance(getWidth(), -1, Image.SCALE_DEFAULT));
                      setIcon(icon);
                      repaint();
                  }


              }
            }
        });
    }

}
