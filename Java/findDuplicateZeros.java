class findDuplicateZeros {
    public void duplicateZeros(int[] arr) {
        // 1 0 2 3 0 4 5 0
        // 1 0 0 2 3 0 0 4
        // this only works if 0's only occur one time
        // refactor to work with any number of 0's

        int zeroCounter = 0;
        for (int i = 0; i <= arr.length - 2; i++) {
            if (arr[i] == 0) {
                ++zeroCounter;
            }
        }

        int j = arr.length - zeroCounter - 1;
        int copy = arr.length - 1;

        while (j >= 0) {
            if (arr[j] == 0) {
                arr[copy] = arr[j];
                --copy;
                arr[copy] = arr[j];
            } else {
                arr[copy] = arr[j];
            }
            --copy;
            --j;
        }

    }
}