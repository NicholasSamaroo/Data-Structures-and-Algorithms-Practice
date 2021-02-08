class highestAltitude {
    public int largestAltitude(int[] gain) {
        int calc = 0;
        int result = 0;

        for (int i = 0; i < gain.length; i++) {
            calc += gain[i];
            if (calc > result) {
                result = calc;
            }
        }
        return result;

    }
}