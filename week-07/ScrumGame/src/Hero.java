import javax.imageio.ImageIO;
import java.awt.*;
import java.io.File;
import java.io.IOException;

public class Hero extends Character {
    public Hero(int posX, int posY) {
        super("images/hero-down.png", posX, posY);
    }

    public void draw(Graphics graphics) {
        if (image != null) {
            graphics.drawImage(image, posX * 72, posY * 72, null);
        }
    }// draw

//    public void move(int x, int y, String filename, int [][] map}) {
//        posX += x ;
//        posY += y ;
//        try {
//            image = ImageIO.read(new File(filename));
//        } catch (IOException e) {
//            e.printStackTrace();
//        }




    public void move(int moveX, int moveY, String filename, int[][] map) {
        int nextX = posX + moveX;
        int nextY = posY + moveY;
        if (nextX >= 0 && nextX < map.length && nextY >= 0 && nextY < map.length && map[nextX][nextY] != 1) {
            posX += moveX;
            posY += moveY;
        }
    }
}