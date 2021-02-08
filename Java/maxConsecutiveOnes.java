class maxConsecutiveOnes {
    public int findMaxConsecutiveOnes(int[] nums) {
        int maxOnes = 0;
        int holder = 0;
        int i = 0;

        while (i < nums.length) {
            if (nums[i] == 1) {
                while (i < nums.length && nums[i] == 1) {
                    ++holder;
                    ++i;
                }

                if (holder > maxOnes) {
                    maxOnes = holder;
                }
            } else {
                ++i;
            }
            holder = 0;
        }

        return maxOnes;
    }
}