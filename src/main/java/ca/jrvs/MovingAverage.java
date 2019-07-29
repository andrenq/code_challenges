package ca.jrvs;

import java.util.ArrayDeque;
import java.util.Queue;

/**
 *  Given a stream of integers and a window size, calculate the moving average of all integers in the sliding window
 *  For example,
 * MovingAverage m = new MovingAverage(3);
 * m.next(1) = 1
 * m.next(10) = (1 + 10) / 2
 * m.next(3) = (1 + 10 + 3) / 3
 * m.next(5) = (10 + 3 + 5) / 3
 *  https://www.lintcode.com/problem/moving-average-from-data-stream/description
 */
public class MovingAverage {

    private final int maxSize;
    private final Queue<Integer> window;
    private long sum = 0;

    public MovingAverage(int maxSize) {
        this.maxSize = maxSize;
        this.window = new ArrayDeque<>(maxSize + 1);
    }

    public double next(int val) {
        window.add(val);
        sum += val;
        if (window.size() > maxSize) {
            sum -= window.poll();
        }
        return (double) sum / window.size();
    }

}
