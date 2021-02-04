class sortedTwoSum {
    // The array is already sorted in ascending
    // With that information in mind, see how we can optimize this code b/c the run
    // time sucks on large numbers.length
    // cause of the nested for loop
    public int[] twoSum(int[] numbers, int target) {
        int[] result = new int[2];

        if (numbers.length == 2) {
            result[0] = 1;
            result[1] = 2;
        } else {
            for (int i = 0; i <= numbers.length - 2; i++) {
                for (int j = i + 1; j < numbers.length; j++) {
                    if ((numbers[i] + numbers[j]) == target) {
                        result[0] = i + 1;
                        result[1] = j + 1;
                        break;
                    }
                }
            }
        }
        return result;
    }
}