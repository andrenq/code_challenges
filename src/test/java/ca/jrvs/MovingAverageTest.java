package ca.jrvs;

import org.junit.Test;
import static org.junit.Assert.*;
public class MovingAverageTest {


    @Test
    public void next() {
        MovingAverage movingAverage = new MovingAverage(3);
        assertEquals(5,movingAverage.next(5),0.0001);
        assertEquals(5.5,movingAverage.next(6),0.0001);
        assertEquals(6,movingAverage.next(7),0.0001);
        assertEquals(7,movingAverage.next(8),0.0001);
        assertEquals(8,movingAverage.next(9),0.0001);
    }
}