package Main;

/**
 * Created by zsofiaprincz on 01/12/16.
 */
public class Ant implements Animal {
        protected  int movedDistance = 0;
    protected int feedCOunter = 0;

    @Override
    public void move(int distance) {
        this.movedDistance +=distance/2;
    }

    @Override
    public void eat() {
        this.feedCOunter+=1;
    }

    @Override
    public String toString() {
        return  this.getClass().getSimpleName() + "{" +
                "movedDistance=" + movedDistance +
                ", feedCOunter=" + feedCOunter +
                '}';
    }
}
