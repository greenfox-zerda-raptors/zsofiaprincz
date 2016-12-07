import java.awt.*;

public class Hero extends Character {
    public Hero(int posX, int posY) {
        super("images/hero-down.png", posX, posY);
    }

    public void draw(Graphics graphics){
        if (image != null) {
            graphics.drawImage(image, posX * 72, posY * 72, null);
        }
    }// draw

}