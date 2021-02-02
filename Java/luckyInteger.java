import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Collections;

class luckyInteger {
    public int findLucky(int[] arr) {
        Map<Integer, Integer> number = new HashMap<>();

        for (int i = 0; i < arr.length; i++) {
            if (!(number.containsKey(arr[i]))) {
                number.put(arr[i], 1);
            } else if (number.containsKey(arr[i])) {
                number.put(arr[i], number.get(arr[i]) + 1);
            }
        }

        // int maxFrequency = Collections.max(number.values());
        // key in number hash map must equal to its value
        int lucky = -1;
        for (Entry<Integer, Integer> entry : number.entrySet()) {
            if (entry.getValue() == entry.getKey()) {
                if (entry.getKey() > lucky) {
                    lucky = entry.getKey();
                }
            }
        }
        return lucky;
    }
}