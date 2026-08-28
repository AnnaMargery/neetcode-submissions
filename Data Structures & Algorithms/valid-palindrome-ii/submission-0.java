class Solution {
    public boolean validPalindrome(String s) {
        // is it already a palindrome?
        // if it is not- check if it can be...
        // only one letter is not ok, the rest are ok

        int left = 0;
        int right = s.length() - 1;

        while (left < right) {
            if (s.charAt(left) != s.charAt(right)) {
                // we do not give up- we need to check neighbour letters
                return isPalindrome(s, left + 1, right) ||
                isPalindrome(s, left, right - 1);
            }
            left++;
            right--;
        }
        return true;
    }

    private boolean isPalindrome(String s, int left, int right) {
        while (left < right) {
            if (s.charAt(left) != s.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}