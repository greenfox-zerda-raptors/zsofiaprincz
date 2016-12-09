import java.awt.*;
import java.util.Random;

/**
 * Created by zsofiaprincz on 08/12/16.
 */
public class Skeleton extends Character {
    public Skeleton( int posX, int posY) {
        super("images/skeleton.png", posX, posY);
        Random random = new Random();
        healthPoint = 2 * random.nextInt(7);
        defendPoint = (int) 0.5 * random.nextInt(7);
        strikePoint = random.nextInt(7);


    }

//    public void draw(Graphics graphics) {
//        if (image != null) {
//            graphics.drawImage(image, posX * 72, posY * 72, null);
//        }
//    }
}
