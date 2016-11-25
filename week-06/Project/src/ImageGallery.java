import javax.swing.*;
import java.awt.*;

/**
 * Created by zsofiaprincz on 25/11/16.
 */
public class ImageGallery extends JFrame {

    Image image1;
    Image image2;
    Image image3;
    Image image4;
    Image image5;

    JLabel image1Name;
    JLabel image2Name;
    JLabel image3Name;
    JLabel image4Name;
    JLabel image5Name;


    JPanel topPanel;
    JPanel bottomPanel;

    JButton topNext;
    JButton topPrevious;
    JButton bottomNext;
    JButton bottomPrevious;

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new ImageGallery();
            }
        });
    }

    public ImageGallery() {


        Toolkit tk = Toolkit.getDefaultToolkit();
        Dimension dim = tk.getScreenSize();

        setSize(600, 600);
        int xPos = (dim.width / 2) - (getWidth() / 2);
        int yPos = (dim.height / 2) - (getHeight() / 2);
        setLocation(xPos, yPos);
        setResizable(false);
        setTitle("Favourite paintings of Caravaggio");
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        topPanel = new JPanel();
        add(topPanel);

        topNext = new JButton(">");
        topPanel.add(topNext);

        topPrevious = new JButton("<");
        topPanel.add(topPrevious);






    }



}
