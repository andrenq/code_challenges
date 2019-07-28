package ca.jrvs;

import org.junit.Test;

import static ca.jrvs.FibonacciNumber.fib;
import static org.junit.Assert.assertEquals;

public class FibonacciNumberTest {

    @Test
    public void fibTest1() {
        int expected = 13;
        assertEquals(expected, fib(7));
    }

    @Test
    public void fibTest2() {
        int expected = 6765;
        assertEquals(expected, fib(20));
    }

    @Test
    public void fibTest3() {
        int expected = 1;
        assertEquals(expected, fib(1));
    }
    @Test
    public void fibTest4() {
        int expected = 1;
        assertEquals(expected, fib(2));
    }
}