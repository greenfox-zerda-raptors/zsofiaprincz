import javax.imageio.ImageIO;
import java.awt.*;
import java.io.File;
import java.io.IOException;
import java.util.Random;


public class Hero extends Character {
    Random random = new Random();
    public Hero(int posX, int posY) {
        super("images/hero-down.png", posX, posY);
        healthPoint=20 + 3 * random.nextInt(7);
        strikePoint=1;
        defendPoint=2;
        alive=true;

    }



//    public void draw(Graphics graphics) {
//        if (image != null) {
//            graphics.drawImage(image, posX * 72, posY * 72, null);
//        }
//    }// draw

    public void move(int x, int y, String filename) {
        posX += x;
        posY += y;
        try {
            image = ImageIO.read(new File(filename));
        } catch (IOException e) {
            e.printStackTrace();
        }




    }

}