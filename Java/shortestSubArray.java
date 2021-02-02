import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

// works for any degree only if there are no other elements with the same degree
// refactor
class shortestSubArray {
    public static void main(String[] args) {
        int[] nums = { 1, 2, 2, 3, 1, 4, 2 };
        Map<Integer, Integer> occurences = new HashMap<>(), index = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            if (!(occurences.containsKey(nums[i]))) {
                occurences.put(nums[i], 1);
            } else if (occurences.containsKey(nums[i])) {
                occurences.put(nums[i], occurences.get(nums[i]) + 1);
            }

            if (!(index.containsKey(nums[i]))) {
                index.put(nums[i], i);
            } else if (index.containsKey(nums[i])) {
                continue;
            }
        }

        int degree = Collections.max(occurences.values());
        int key;

        for (Entry<Integer, Integer> entry : occurences.entrySet()) {
            if (entry.getValue() == degree) {
                key = entry.getKey();
            }
        }

        int value = index.get(key);
        int degreeCounter = 1;
        int shortestSubArraySize = 1;

        for (int i = value + 1; i < nums.length; i++) {
            ++shortestSubArraySize;
            if (nums[i] == key) {
                ++degreeCounter;
            }

            if (degreeCounter == degree) {
                break;
            }
        }
    }
}