import java.util.HashMap;
import java.util.Map.Entry;

class Solution {
    public int sumOfUnique(int[] nums) {
        Map<Integer, Integer> mapping = new HashMap<Integer, Integer>();
        int result = 0;

        for (int i = 0; i < nums.length; i++) {
            if (!(mapping.containsKey(nums[i]))) {
                mapping.put(nums[i], 1);
            } else if (mapping.containsKey(nums[i])) {
                mapping.put(nums[i], mapping.get(nums[i]) + 1);
            }
        }

        for (Entry<Integer, Integer> entry : mapping.entrySet()) {
            if (entry.getValue() == 1) {
                result += entry.getKey();
            }
        }
        return result;
    }
}