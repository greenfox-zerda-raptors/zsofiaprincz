import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.ImageObserver;
import java.awt.image.ImageProducer;
import java.io.File;
import java.util.ArrayList;

/**
 * Created by zsofiaprincz on 25/11/16.
 */
public class ImageGallery extends JFrame {

    Image image1;
    Image image2;
    Image image3;
    Image image4;
    Image image5;
    int pos =0;

    JLabel imageLabel;

    ArrayList<Image> notSureINeedThis ;
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


        topPanel = new JPanel(){
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                g.drawImage(image1, 0, 0, null);
            }
        };

        add(topPanel);

        topNext = new JButton(">");
        topPanel.add(topNext);
        topNext.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                pos = pos + 1;
                if (pos >= getImages().length) {
                    pos = getImages().length - 1;
                }
                showImage(pos);

            }
        });

        topPrevious = new JButton("<");
        topPrevious.setHorizontalAlignment(SwingConstants.RIGHT);



        topPanel.add(topPrevious);
        topPrevious.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);


        image1 = Toolkit.getDefaultToolkit().getImage("image1.jpg");
        image2 = Toolkit.getDefaultToolkit().createImage("image2.jpg");
        image3 = Toolkit.getDefaultToolkit().createImage("image3.jpg");
        image4 = Toolkit.getDefaultToolkit().createImage("image4.jpg");
        image5 = Toolkit.getDefaultToolkit().createImage("image5.jpg");




        imageLabel = new JLabel();






        ArrayList<Image> imageList = new ArrayList<>();
        imageList.add(image1);
        imageList.add(image2);
        imageList.add(image3);
        imageList.add(image4);
        imageList.add(image5);



    }
        public String[] getImages() {

            File file = new File(getClass().getResource("/Users/zsofiaprincz/Greenfox/zsofiaprincz/week-06/Project").getFile());

            String[] imagesList = file.list();

            return imagesList;

        }

        public void showImage(int index)
        {
            String[] imagesList = getImages();

            String imageName = imagesList[index];

            ImageIcon icon = new ImageIcon(getClass().getResource("/Users/zsofiaprincz/Greenfox/zsofiaprincz/week-06/Project"+imageName));

            Image image = icon.getImage().getScaledInstance(imageLabel.getWidth(), imageLabel.getHeight(), Image.SCALE_SMOOTH);

            imageLabel.setIcon(new ImageIcon(image));
        }







}




