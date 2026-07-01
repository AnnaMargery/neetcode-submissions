class Solution {
    public boolean isSubsequence(String s, String t) {
        /*
        s- tested to be a subsequence
        t- original string

        t= "neetcode"
        s = "node"

        */

        int j = 0;
        for (int i = 0; i < t.length(); i++) {
            if (j == s.length())
                return true;
            if (t.charAt(i) == s.charAt(j)) {
                j++;
                continue;
            }
        }
        return j == s.length();
    }
}