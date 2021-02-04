import java.util.Arrays;

class arrayPairs {
    public int arrayPairSum(int[] nums) {
        // 6, 2, 6, 5, 1, 2
        // 1, 2, 2, 5, 6, 6
        // 1, 4, 3, 2
        // 1, 2, 3, 4
        // Given an integer array nums of 2n integers, group these integers into n pairs
        // (a1, b1), (a2, b2), ..., (an, bn)
        // such that the sum of min(ai, bi) for all i is maximized. Return the maximized
        // sum.

        int i = 0;
        int sum = 0;
        Arrays.sort(nums);
        while (i <= nums.length - 2) {
            sum += Math.min(nums[i], nums[i + 1]);
            i += 2;
        }
        return sum;
    }
}