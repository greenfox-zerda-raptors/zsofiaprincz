import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.ImageObserver;
import java.awt.image.ImageProducer;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created by zsofiaprincz on 25/11/16.
 */
public class ImageGallery extends JFrame {

    ImageIcon image1;
    ImageIcon image2;
    ImageIcon image3;
    ImageIcon image4;
    ImageIcon image5;


    JLabel imageLabel1;
    JLabel imageLabel2;
    JLabel imageLabel3;
    JLabel imageLabel4;
    JLabel imageLabel5;



    ArrayList<JLabel> myImages = new ArrayList<JLabel>();
    int index;

    ArrayList<JLabel> imageNames = new ArrayList<JLabel>();
    int nameindex;

    JPanel wrapperPanel;
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
        setLayout(new FlowLayout());
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setTitle("Favourite paintings of Caravaggio");
        setVisible(true);


        Toolkit tk = Toolkit.getDefaultToolkit();
        Dimension dim = tk.getScreenSize();

        setLayout(new FlowLayout());
        setSize(1000, 1000);
        int xPos = (dim.width / 2) - (getWidth() / 2);
        int yPos = (dim.height / 2) - (getHeight() / 2);
        setLocation(xPos, yPos);
        setResizable(true);
        setTitle("Favourite paintings of Caravaggio");
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);




        topPanel = new JPanel();
        add(topPanel);
//        topPanel.setLayout(new BoxLayout(topPanel, BoxLayout.X_AXIS));

        topPrevious = new JButton("<");
        topPrevious.setBorderPainted(false);
        topPrevious.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                index--;
                if (index < 0) {
                    index = myImages.size() - 1;}

                imageLabel1.setIcon(myImages.get(index).getIcon());
//                imageLabel1.setPreferredSize(new Dimension(100,100));




            }
        });

        topPanel.add(topPrevious);

        image1 = new ImageIcon("image1.jpg");


        imageLabel1 = new JLabel(image1);
        topPanel.add(imageLabel1);


        topNext = new JButton(">");
        topNext.setBorderPainted(false);
        topNext.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                index++;
                if(index == myImages.size()) {
                    index = 0;}
                imageLabel1.setIcon(myImages.get(index).getIcon());
//                imageLabel1.setPreferredSize(new Dimension(100,100));
            }
        });
        topPanel.add(topNext);


        bottomPanel = new JPanel();
        this.add(bottomPanel);
//        bottomPanel.setLayout(new BoxLayout(bottomPanel, BoxLayout.X_AXIS));


        image2 = new ImageIcon("image2.jpg");
        imageLabel2 = new JLabel(image2);
        imageLabel2.setPreferredSize(new Dimension(100,100));
        bottomPanel.add(imageLabel2);

        image3 = new ImageIcon("image3.jpg");
        imageLabel3 = new JLabel(image3);
        imageLabel3.setPreferredSize(new Dimension(100,100));
        bottomPanel.add(imageLabel3);

        image4 = new ImageIcon("image4.jpg");
        imageLabel4 = new JLabel(image4);
        imageLabel4.setPreferredSize(new Dimension(100,100));
        bottomPanel.add(imageLabel4);

        image5 = new ImageIcon("image5.jpg");
        imageLabel5 = new JLabel(image5);
        imageLabel5.setPreferredSize(new Dimension(100,100));
        bottomPanel.add(imageLabel5);



        wrapperPanel = new JPanel();
        wrapperPanel.add(topPanel);
        wrapperPanel.add(bottomPanel);
        wrapperPanel.setLayout(new BoxLayout(wrapperPanel, BoxLayout.Y_AXIS));
        wrapperPanel.setBackground(Color.LIGHT_GRAY);
        this.add(wrapperPanel);


        this.pack();
        int xPosition = (dim.width / 2) - (this.getWidth() / 2);
        int yPosition = (dim.height / 2) - (this.getHeight() / 2);
        this.setLocation(xPosition, yPosition);

        myImages = new ArrayList(Arrays.asList(imageLabel1,imageLabel2,imageLabel3,imageLabel4,imageLabel5));




    }






}




