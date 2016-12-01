package Main;

/**
 * Created by zsofiaprincz on 01/12/16.
 */
public class Horse extends AbstractAnimal {

    public Horse(String name) {
        super(name);
    }

    @Override
    int defaultFoodAmount() {
        return 20;
    }
}
