package Main;

/**
 * Created by zsofiaprincz on 01/12/16.
 */
public abstract class AbstractAnimal implements Animal {

    private int movedDistance = 0;
    private int feedCounter =0;
    private String name;
    private int childrenNum = 0;

    @Override
    public void move(int distance) {
        this.movedDistance +=distance;
    }

    @Override
    public void eat() {
        this.feedCounter += defaultFoodAmount();

    }

    abstract int defaultFoodAmount();

    public AbstractAnimal(String name) {
        this.name = name;
    }
    //a neve altalaban nem valtozik
    public String getName() {
        return name;
    }


    //a gyerekeinek a szama valtozhat, ezert kell getter es setter is
    public int getChildrenNum() {
        return childrenNum;
    }

    public void setChildrenNum(int childrenNum) {
        if(childrenNum<0)
        this.childrenNum = childrenNum;
    }

    public int getFeedCounter() {
        return feedCounter;
    }

    @Override
    public String toString() {
        return "AbstractAnimal{" +
                "movedDistance=" + movedDistance +
                ", feedCounter=" + feedCounter +
                ", name='" + name + '\'' +
                ", childrenNum=" + childrenNum +
                '}';
    }
}
