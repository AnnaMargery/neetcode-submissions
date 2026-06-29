class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }
        char[] sArrayChars = s.toCharArray();
        char[] tArrayChars = t.toCharArray();
        Arrays.sort(sArrayChars);
        Arrays.sort(tArrayChars);

        return Arrays.equals(sArrayChars,tArrayChars);
    }
}
