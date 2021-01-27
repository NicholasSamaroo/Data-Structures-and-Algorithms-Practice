class reverseString {
    public static void main(String[] args) {
        char[] reverse = { 'H', 'a', 'n', 'n', 'a', 'h' };
        reverseCharArray(reverse, reverse.length);
        System.out.println(reverse);
    }

    public static void reverseCharArray(char[] arr, int size) {
        int i = 0;
        int j = size - 1;
        char holder;

        while (i != j) {
            if (i > j)
                break;
            holder = arr[i];
            arr[i] = arr[j];
            arr[j] = holder;
            ++i;
            --j;
        }
    }
}