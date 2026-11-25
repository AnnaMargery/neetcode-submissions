class Solution {
    public boolean isAnagram(String s, String t) {
        if(s== null || t == null) return false;

        char[] sChars = s.toCharArray();
        char[] tChars = t.toCharArray();

        Arrays.sort(sChars);
        Arrays.sort(tChars);
        return Arrays.equals(sChars,tChars);
    }
}
