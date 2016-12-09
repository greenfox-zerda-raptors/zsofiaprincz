import java.awt.*;
import java.util.Random;

/**
 * Created by zsofiaprincz on 08/12/16.
 */
public class Boss extends Character {
    public Boss(int posX, int posY) {
        super("images/boss.png", posX, posY);
        Random random = new Random();
        healthPoint = 2 * random.nextInt(7) + random.nextInt(7);
        defendPoint = (int) 0.5 * random.nextInt(7) + random.nextInt(7) / 2;
        strikePoint = random.nextInt(7);
    }

//    public void draw(Graphics graphics) {
//        if (image != null) {
//            graphics.drawImage(image, posX * 72, posY * 72, null);
//        }
//    }
}

