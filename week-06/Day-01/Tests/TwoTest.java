import org.junit.Test;

import java.util.ArrayList;
import java.util.Collections;

import static org.junit.Assert.*;

/**
 * Created by zsofiaprincz on 21/11/16.
 */
public class TwoTest {
    @Test
    public void sum() throws Exception {
        ArrayList<Integer> myList = new ArrayList<Integer>();
        Collections.addAll(myList, 2, 4, 6, 8, 10);
        assertEquals(30 , Two.sum(myList));


    }

    public void sum2() throws Exception {
        ArrayList<Integer> myList = new ArrayList<Integer>();
        assertEquals(null , Two.sum(myList));


    }

    public void sum3() throws Exception {

        ArrayList<Integer> myList = new ArrayList<Integer>();
        myList.add(9);
        assertEquals(9 , Two.sum(myList));


    }
}
