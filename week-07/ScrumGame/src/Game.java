import javax.swing.*;

/**
 * Created by zsofiaprincz on 05/12/16.
 */
public class Game extends JFrame {

    public Game(){

        this.setSize(720,900);
        this.setTitle("RPG");
        setLocationRelativeTo(null);
        setResizable(false);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);



    }

    public void runGame() {

        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new Game();
            }


        });

    }

}
