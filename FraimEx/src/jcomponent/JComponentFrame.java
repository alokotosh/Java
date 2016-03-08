package jcomponent;

import javafx.stage.FileChooser;

import javax.swing.*;
import javax.swing.JComponent;
import javax.swing.filechooser.FileNameExtensionFilter;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.io.File;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import javax.swing.filechooser.*;
import javax.swing.filechooser.FileFilter;

/**
 * Created by kepler23 on 8/27/15.
 */
public class JComponentFrame extends JFrame {
    private static final int FONTSIZE=20;

    private JCheckBox bold;
    private JCheckBox italic;
    private JComboBox userComboBox;
    private  final JTextArea textArea;

    private Action saveAction;
    private Action saveAsAction;


    public JComponentFrame()

    {
        setTitle("Private Chat");
        setSize(800, 600);


//MenuBar
        JMenuBar menuBar = new JMenuBar();
        setJMenuBar(menuBar);
        JMenu fileMenu = new JMenu("File");
//Open
        JMenuItem openItem = fileMenu.add(new FrameAction("Open"));
        openItem.setAccelerator(KeyStroke.getKeyStroke("Crtl O"));
        openItem.setAccelerator(KeyStroke.getKeyStroke("Crtl S"));

        //Listener File ->Open
        openItem.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JFileChooser chooser = new JFileChooser();

//                FileNameExtensionFilter filter = new FileNameExtensionFilter("Image files", "gif", "jpg","jpeg");
//                chooser.setFileFilter(filter);
//
//                chooser.setCurrentDirectory(new File("."));
//                chooser.setAccessory(new ImagePreviewer(chooser));
//                chooser.setFileView(new FileIconView(null,new ImageIcon("Files/Cover.jpg")));

                int result = chooser.showOpenDialog(JComponentFrame.this);
                if(result== JFileChooser.APPROVE_OPTION)
                {
                    String name = chooser.getSelectedFile().getPath();
                    JLabel label = new JLabel();
                    label.setIcon(new ImageIcon(name));
                }


            }
        });

        fileMenu.add(openItem);


       // openItem.setAccelerator(KeyStroke.getKeyStroke("crt O"));
       // fileMenu.addSeparator();

   //     saveAction = new FrameAction("Save");
   //      JMenuItem saveItem = fileMenu.add(saveAction);
   //     saveItem.setAccelerator(KeyStroke.getKeyStroke("crt S"));

        //saveAsAction = new FrameAction("Save As");
        //fileMenu.add(saveAsAction);
        //fileMenu.addSeparator();

        fileMenu.add(new AbstractAction("Exit") {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });


        JMenu editMenu = new JMenu("Edit");
        fileMenu.setMnemonic('E');
        JMenu viewMenu = new JMenu("View");
        fileMenu.setMnemonic('V');
        JMenu buddiesMenu = new JMenu("Buddies");
        fileMenu.setMnemonic('B');
        JMenu windowsMenu = new JMenu("Windows");
        fileMenu.setMnemonic('W');
        JMenu helpMenu = new JMenu("Help");
        fileMenu.setMnemonic('H');

        menuBar.add(fileMenu);
        menuBar.add(editMenu);
        menuBar.add(viewMenu);
        menuBar.add(buddiesMenu);
        menuBar.add(windowsMenu);
        menuBar.add(helpMenu);

//Menu File MenuItem
       // JMenuItem openItem = new JMenuItem("Open   Crtl+O");
       // JMenuItem saveItem = new JMenuItem("Save   Crtl+S");

     //   fileMenu.add(saveItem);
      //  editMenu.addSeparator();
      //  JMenu optionMenu = new JMenu("What?");
       // editMenu.add(optionMenu);
      //  editMenu.add("Past");

        //JCheckBoxMenuItem readonlyltem = new JCheckBoxMenuItem ( "Read only");
       // optionMenu.add(readonlyltem);
//Pop-up menu
        JPopupMenu popup = new JPopupMenu ();
        JMenuItem  popUpItem = new JMenuItem();
        popUpItem.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
        popup.add(popUpItem);

// TextArea

        JPanel centerPanel = new JPanel();
        textArea = new JTextArea(50,40);
        textArea.setEnabled(false);
        textArea.setLineWrap(true);
        textArea.setWrapStyleWord(true);
        textArea.setFont(new Font("Serif", Font.PLAIN, FONTSIZE));
        textArea.setComponentPopupMenu(popup);

//Scroll, add TextArea to Scroll
        JScrollPane scrollPane = new JScrollPane(textArea);
        centerPanel.add(scrollPane);
        add(centerPanel, BorderLayout.CENTER);

//SouthPanel
        JPanel southPanel = new JPanel();
        JButton sendButton = new JButton("Send");
        JTextField  sendTF = new JTextField(20);
        JButton exitButton = new JButton("Exit");
        southPanel.add(sendButton);
        southPanel.add(exitButton);
        southPanel.add(sendTF);
        getRootPane().setDefaultButton(sendButton);

//        popup.show(southPanel,50,50);
        sendTF.setComponentPopupMenu(popup);

//UserListComboBox
        userComboBox = new JComboBox();
        userComboBox.setEditable(false);
        userComboBox.addItem("Sofa ");
        userComboBox.addItem("Alex ");
        userComboBox.addItem("Boogawe ");

        userComboBox.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                sendTF.setText("->"+userComboBox.getSelectedItem().toString());
            }
        });

        southPanel.add(userComboBox);

        // Font listener
        ActionListener listener = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int mode =0;
                if(bold.isSelected()){mode +=Font.BOLD;}
                if (italic.isSelected()){mode +=Font.ITALIC;}
                textArea.setFont(new Font("Serif",mode,FONTSIZE));

            }
        };

// West Panel
        JPanel westPanel = new JPanel();
        bold = new JCheckBox("BOLD");
        bold.addActionListener(listener);
        westPanel.add(bold);
        italic = new JCheckBox("ITALIC");
        italic.addActionListener(listener);
        westPanel.add(italic);

        JToolBar bar = new JToolBar();


// Key Send
        InputMap imap = new InputMap();
        southPanel.getInputMap(JComponent.WHEN_ANCESTOR_OF_FOCUSED_COMPONENT);
        imap.put(KeyStroke.getKeyStroke("Enter"), KeyEvent.VK_ENTER);

        ActionMap amap = sendButton.getActionMap();
        amap.put(KeyEvent.VK_ENTER, null);

        exitButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });
        sendButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                GregorianCalendar calendar = new GregorianCalendar();
                int hour = calendar.get(Calendar.HOUR_OF_DAY);
                int minutes = calendar.get(Calendar.MINUTE);


                String empty = "";
                String text;
                String writeText = sendTF.getText();
                Boolean swith = true;
                text = "@: " + writeText + " " + +hour + ":" + minutes + "\n";
                if (writeText.equals(empty)) {
                    getToolkit().beep();
                    text = "";
                }
                if (!text.equals(empty) && swith == true) {
                    textArea.setFont(new Font("Serif", Font.BOLD, FONTSIZE));
                    textArea.append(text);
                    swith = false;


                } else {
                    textArea.setFont(new Font("Serif", Font.ITALIC, FONTSIZE));
                    textArea.append(text);
                    swith = true;


                }


                //    textArea.append(text);
                sendTF.setText(" ");
            }
        });
       // sendButton.setMnemonic('E');
        add(southPanel, BorderLayout.SOUTH);
        }
    }
