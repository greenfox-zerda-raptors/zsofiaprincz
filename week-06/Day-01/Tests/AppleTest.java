import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by zsofiaprincz on 21/11/16.
 */
public class AppleTest {
    @Test
    public void getApple() throws Exception {

        Apple myObject = new Apple();
        assertEquals("apple", myObject.getApple());
    }



}