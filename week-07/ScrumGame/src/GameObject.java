import javax.imageio.ImageIO;

import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;


public abstract class GameObject {

    BufferedImage image;
    int posX, posY;

    public GameObject(String filename, int posX, int posY) {
        this.posX = posX;
        this.posY = posY;
        try {
            image = ImageIO.read(new File(filename));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }// cons GameObject

    abstract public void draw(Graphics graphics);

}// GameObject