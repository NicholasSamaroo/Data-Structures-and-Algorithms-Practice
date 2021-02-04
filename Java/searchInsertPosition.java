class searchInsertPosition {
    public int searchInsert(int[] nums, int target) {
        int resultFound = -1;
        int resultNotFound = -1;

        if (nums.length == 1) {
            if (nums[0] >= target) {
                resultFound = 0;
            } else {
                resultNotFound = nums.length;
            }
        } else {

            for (int i = 0; i < nums.length; i++) {
                if (nums[i] == target) {
                    resultFound = i;
                    break;
                }
            }

            if (resultFound == -1) {
                for (int i = 0; i < nums.length; i++) {
                    if (i == nums.length - 1 && target > nums[i]) {
                        resultNotFound = nums.length;
                        break;
                    }

                    if (nums[i] > target) {
                        resultNotFound = i;
                        break;
                    }
                }
            }
        }
        return resultFound > resultNotFound ? resultFound : resultNotFound;
    }
}

// After completing the problem, realized it could be boiled down to this
// solution
// Produces faster run time and less memory usage
class searchInsertPosition {
    public int searchInsert(int[] nums, int target) {
        int result = 0;

        for (int i = 0; i < nums.length; i++) {
            if (i == nums.length - 1 && nums[i] < target) {
                result = nums.length;
            } else if (nums[i] == target || nums[i] > target) {
                result = i;
                break;
            }
        }
        return result;
    }
}