import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by zsofiaprincz on 24/11/16.
 */
public class WrapperApp extends JFrame implements ActionListener {




    @Override
    public void actionPerformed(ActionEvent e) {
        System.exit(0);
    }

   public WrapperApp(){


       JMenuBar menuBar;
       JMenu menu;
       JMenu menu2;
       JMenuItem menuItemExit;

       this.setTitle("Workshop Wrapper");
       this.setSize(500, 500);
       this.setResizable(false);
       Toolkit tk = Toolkit.getDefaultToolkit();
       Dimension dim = tk.getScreenSize();
       int xPos = (dim.width / 2) - (this.getWidth() / 2);
       int yPos = (dim.height / 2) - (this.getHeight() / 2);
       this.setLocation(xPos, yPos);
       this.setVisible(true);
       this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

       menuBar = new JMenuBar();
       menu = new JMenu("File");
       menu2 = new JMenu("Edit");
       menuItemExit = new JMenuItem("Exit");

       menuBar.add(menu);
       menuBar.add(menu2);
       menu.add(menuItemExit);
       setJMenuBar(menuBar);

       menuItemExit.addActionListener(this);


       }















    public static void main(String[] args) {

        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new WrapperApp();
            }
        });
    }

}

