import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

/**
 * Created by zsofiaprincz on 24/11/16.
 */
public class EventCounter extends JFrame {

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new EventCounter();
            }
        });
    }
    //variables set up

    int mouseEvent;
    int windowEvent;
    int keyboardEvent;

    JTextField textField = new JTextField(30);
    JButton myButton = new JButton("Press me");
    JTextArea textArea = new JTextArea(20,20);

    public EventCounter () {
        JPanel myPanel = new JPanel();

        //position
        this.setTitle("Event Counter");
        this.setSize(400, 400);
        Toolkit tk = Toolkit.getDefaultToolkit();
        Dimension dim = tk.getScreenSize();
        int xPos = (dim.width / 2) - (this.getWidth() / 2);
        int yPos = (dim.height / 2) - (this.getHeight() / 2);
        this.setLocation(xPos, yPos);
        this.setVisible(true);
        this.setDefaultCloseOperation(3);
        this.add(myPanel);

        //mouselistener added to button, results printed to textarea

        MouseListener myMouseListener = new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
                mouseEvent++;
                textArea.append("Mouse Clicks: " + mouseEvent + "\n");

            }

            @Override
            public void mousePressed(MouseEvent e) {

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

                };

        myButton.addMouseListener(myMouseListener);
        myPanel.add(myButton);


        WindowListener myWindowListener = new WindowListener() {
            @Override
            public void windowOpened(WindowEvent e) {
                windowEvent++;
                textArea.append("Number of window events: " + windowEvent + "\n");

            }

            @Override
            public void windowClosing(WindowEvent e) {

            }

            @Override
            public void windowClosed(WindowEvent e) {

            }

            @Override
            public void windowIconified(WindowEvent e) {

            }

            @Override
            public void windowDeiconified(WindowEvent e) {

            }

            @Override
            public void windowActivated(WindowEvent e) {

            }

            @Override
            public void windowDeactivated(WindowEvent e) {

            }
        };
        this.addWindowListener(myWindowListener);



        //keylistener to text field and  result to text area

        KeyListener keyboardListener = new KeyListener() {
            @Override
            public void keyTyped(KeyEvent e) {
                keyboardEvent++;
                textArea.append("Key Hit: " + keyboardEvent + "\n");
            }

            @Override
            public void keyPressed(KeyEvent e) {

            }

            @Override
            public void keyReleased(KeyEvent e) {

            }
        };
        textField.addKeyListener(keyboardListener);
        myPanel.add(textField);




        myPanel.add(textArea);




    }



}
