class Solution {
    public boolean isAnagram(String s, String t) {
        Map<Character, Integer> wordS = new HashMap<>();
        Map<Character, Integer> wordT = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            char letter = s.charAt(i);
            wordS.put(letter,wordS.getOrDefault(letter,0)+1);
        }

          for (int i = 0; i < t.length(); i++) {
            char letter = t.charAt(i);
            wordT.put(letter,wordT.getOrDefault(letter,0)+1);
        }
        return wordS.equals(wordT);
    }
}
