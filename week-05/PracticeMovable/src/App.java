/**
 * Created by zsofiaprincz on 29/11/16.
 */
public class App {

    public static void main(String[] args) {
        MovableCircle circle = new MovableCircle(3, 0,0,1,1);
        MovableCircle circle2 = new MovableCircle(3, new MovablePoint(0,0,1,1));

        MovablePoint centerPoint = new MovablePoint(0,0,1,1);

        MovableCircle circle3 = new MovableCircle(3, centerPoint);
        MovableCircle circle4 = new MovableCircle(3, centerPoint);
        MovableCircle circle5 = new MovableCircle(3, centerPoint);
        MovableCircle circle6 = new MovableCircle(3, centerPoint);
    }
}
