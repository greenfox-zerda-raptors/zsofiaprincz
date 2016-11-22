import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by zsofiaprincz on 21/11/16.
 */
public class FibonacciTest {
    @Test
    public void fibonacci() throws Exception {
        Fibonacci fibo = new Fibonacci();
        assertEquals(0, fibo.fibonacci(0));
    }

    @Test
    public void fibonacci2() throws Exception {
        Fibonacci fibo = new Fibonacci();
        assertEquals(1, fibo.fibonacci(1));
    }

    @Test
    public void fibonacci3() throws Exception {
        Fibonacci fibo = new Fibonacci();
        assertEquals(21, fibo.fibonacci(8));
    }
    }

