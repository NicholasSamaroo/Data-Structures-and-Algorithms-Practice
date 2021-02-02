
/* Given an array, we want to find three numbers whose product is maximum and return that product
   So either the two most negative numbers multiplied by the largest positive number or
   the three largest positive numbers can be the result IF the array is sorted before hand
   The built in Arrays.sort could be replaced with a self implemented sorting algorithm
   but the overall premise would be the same.  */
import java.util.Arrays;

class maximumProduct {

    public static void main(String[] args) {
        int[] input = { 1, 5, 3, 4, 5, 6, 7, 8 };
        int max = findMaxProduct(input);
        System.out.println(max);
    }

    public static int findMaxProduct(int[] nums) {
        Arrays.sort(nums);
        int postiveMax = nums[nums.length - 1] * nums[nums.length - 2] * nums[nums.length - 3];
        int negativeMax = nums[0] * nums[1] * nums[nums.length - 1];
        return Math.max(postiveMax, negativeMax);
    }
}