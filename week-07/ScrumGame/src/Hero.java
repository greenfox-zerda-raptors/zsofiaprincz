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