class sameHalves {
    public static void main(String[] args) {
        String input = "textbook";
        boolean result = halvesAreAlike(input);
        System.out.println(result);
    }

    public static boolean halvesAreAlike(String s) {
        char[] a = s.toCharArray();
        // int i = 0;
        // int j = a.length - 1;
        char[] vowels = { 'a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U' };
        int aVowels = 0;
        int bVowels = 0;

        for (int i = 0, j = a.length - 1; i < j; ++i, --j) {
            for (int k = 0; k < vowels.length; ++k) {
                if (a[i] == vowels[k]) {
                    ++aVowels;
                }

                if (a[j] == vowels[k]) {
                    ++bVowels;
                }
            }
        }
        return aVowels == bVowels;
    }
}