package LeetCode;

public class Problem04 {

    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int m = nums1.length;
        int n = nums2.length;
        int[] nums = new int[m + n];
        if(m == 0 && n == 0) {
            return 0;
        }
        if(m == 0) {
            if(n % 2 == 0) {
                return (nums2[n / 2 - 1] + nums2[n / 2]) / 2.0;
            } else {
                return nums2[n / 2];
            }
        }
        if(n == 0) {
            if(m % 2 == 0) {
                return (nums1[m / 2 -1] + nums1[m / 2]) / 2.0;
            } else {
                return nums1[m / 2];
            }
        }

        int i = 0, j = 0, count = 0;
        while(count != (m + n)) {
            if(i == m) {
                while(j != n) {
                    nums[count] = nums2[j];
                    ++count;
                    ++j;
                }
                break;
            }
            if(j == n) {
                while(i != m) {
                    nums[count] = nums1[i];
                    ++count;
                    ++i;
                }
                break;
            }
            if(nums1[i] < nums2[j]) {
                nums[count] = nums1[i];
                ++count;
                ++i;
            } else {
                nums[count] = nums2[j];
                ++count;
                ++j;
            }
        }
        if(count % 2 == 0) {
            return (nums[count / 2 -1] + nums[count / 2]) / 2.0;
        } else {
            return nums[count / 2];
        }
    }
}
