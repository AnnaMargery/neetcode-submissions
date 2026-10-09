class Solution {
    public int lengthOfLongestSubstring(String s) {
        int left = 0;
        int result = 0;
        Map<Character, Integer> map = new HashMap<>();

        for (int right = 0; right < s.length(); right++) {
            char c = s.charAt(right);
            if (map.containsKey(c)) {
                left = Math.max(map.get(c) + 1, left);
            }
            map.put(c, right);
            result = Math.max(result, right - left + 1);
        }
        return result;
    }
}
