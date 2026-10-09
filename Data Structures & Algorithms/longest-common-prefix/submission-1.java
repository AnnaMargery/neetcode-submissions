class Solution {
    public String longestCommonPrefix(String[] strs) {
        if (strs == null || strs.length == 0)
            return "";

        String shortestStr = strs[0];
        for (String str : strs) {
            if (str.length() < shortestStr.length()) {
                shortestStr = str;
            }
        }

        for (int i = 0; i < shortestStr.length(); i++) {
            char currentChar = shortestStr.charAt(i);

            for (int j = 0; j < strs.length; j++) {
                if (strs[j].charAt(i) != currentChar) {
                    return shortestStr.substring(0, i);
                }
            }
        }
        return shortestStr;
    }
}
