import Main.Horse;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by zsofiaprincz on 01/12/16.
 */
public class TestHorse {
    private Horse horse;

    @Before
    private void initTest(){
        horse = new Horse("Paci");
    }

    @Test
    public void testEat() throws Exception {
        int feedConterBeforeFeed = horse.getFeedCounter();
        horse.eat();
        int feedCounterAfterFeed = horse.getFeedCounter();
        assertEquals(20,feedCounterAfterFeed - feedConterBeforeFeed);
    }

    @Test
    public void testFeed() throws Exception{

    }

    @Test (expected = IllegalArgumentException.class)
    public void setChildrenNum() throws Exception {
        horse.setChildrenNum(-1);
    }
}
