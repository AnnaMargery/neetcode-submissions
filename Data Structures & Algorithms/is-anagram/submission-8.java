class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length())
            return false;

        return computeCharValue(s).equals(computeCharValue(t));
    }

    private Map<Character,Integer> computeCharValue(String str) {
        Map<Character,Integer> countChars = new HashMap<>();

        for (int i = 0; i < str.length(); i++) {
            countChars.put(str.charAt(i), countChars.getOrDefault(str.charAt(i), 0) +1);
        }
        return countChars;
    }
}
