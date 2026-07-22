class Solution {
    public void reverseString(char[] s) {
        int j = s.length - 1;
        char temp = s[0];
        for (int i = 0; i < s.length; i++) {
            if (j > i) {
                temp = s[i];
                s[i] = s[j];
                s[j] = temp;
            }
            j--;
        }
    }
}