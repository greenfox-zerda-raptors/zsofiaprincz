import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class Game extends JFrame implements ActionListener{
    public Game() {
        //Create and set up the window.
        new JFrame("maszkalos"); // JFrame Game =
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setResizable(false);

        //Add content to the window.
        JPanel board = new Board();
        this.add(board);

        //Display the window.
        this.pack(); //pack must be before setLocationRelativeTo(null);
        this.setLocationRelativeTo(null);

        this.setVisible(true);

    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }
}
