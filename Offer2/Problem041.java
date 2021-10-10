package Offer2;

import java.util.LinkedList;
import java.util.Queue;

public class Problem041 {
    class MovingAverage {
        private Queue<Integer> mNums;
        private int mSize;
        private int mSum;

        public MovingAverage(int size) {
            mNums = new LinkedList<>();
            mSize = size;
        }

        public double next(int val) {
            mNums.offer(val);
            mSum += val;
            if (mNums.size() > mSize) {
                mSum -= mNums.poll();
            }
            return (double) mSum / mNums.size();
        }
    }
}
