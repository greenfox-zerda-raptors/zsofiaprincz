import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

/**
 * Created by zsofiaprincz on 05/12/16.
 */
public class Board extends JComponent {

    ArrayList<GameObject> gameObjects;

    String [][] map = new String[][]{
            {"floor","floor","floor","wall","floor","wall","floor","floor","floor","floor"},
            {"floor","floor","floor","wall","floor","wall","floor","floor","floor","floor"},
            {"floor","wall","wall","wall","floor","wall","floor","floor","floor","floor"},
            {"floor","floor","floor","floor","floor","wall","floor","floor","floor","floor"},
            {"wall","wall","wall","wall","floor","wall","wall","wall","wall","floor"},
            {"floor","wall","floor","wall","floor","floor","floor","floor","wall","floor"},
            {"floor","wall","floor","wall","floor","floor","floor","floor","wall","floor"},
            {"floor","floor","floor","floor","floor","wall","wall","floor","wall","floor"},
            {"floor","wall","wall","wall","floor","floor","floor","floor","wall","floor"},
            {"floor","floor","floor","wall","floor","wall","wall","floor","wall","floor"},
            {"floor","wall","floor","wall","floor","wall","floor","floor","floor","floor"}


    };

    public Board() {

        this.setPreferredSize(new Dimension(720, 720));
        this.setVisible(true);

        for(int i=0;i<10;i++){
            for (int j=0;j<11;j++){

                if (map[i][j]=="wall"){

                     gameObjects.add(new Wall(i,j));
            } else {
                    gameObjects.add(new Floor(i,j));
                }
        }

    }

    @Override
    public void paint(Graphics graphics) {
        for (GameObject gameObject : gameObjects){
            gameObject.draw(graphics);
        }



    }







}
