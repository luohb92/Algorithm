package Offer2;

import java.util.LinkedList;
import java.util.Queue;

public class Problem042 {
    class RecentCounter {
        private Queue<Integer> mTimes;
        private int width;
        public RecentCounter() {
            mTimes = new LinkedList<>();
            width = 3000;
        }

        public int ping(int t) {
            mTimes.offer(t);
            while(mTimes.peek() + width < t) {
                mTimes.poll();
            }
            return mTimes.size();
        }
    }
}
