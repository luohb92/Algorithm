package offer;

import java.util.HashSet;
import java.util.Set;

public class Problem61 {
    public boolean isStraight(int[] nums) {
        int max = 0;
        int min = 14;
        Set<Integer> set = new HashSet<>();
        for(int num: nums) {
            if(num == 0){
                continue;
            }
            max = Math.max(num, max);
            min = Math.min(min, num);
            if(set.contains(num)) {
                return false;
            }
            set.add(num);
        }
        return (max - min) < 5;
    }
}