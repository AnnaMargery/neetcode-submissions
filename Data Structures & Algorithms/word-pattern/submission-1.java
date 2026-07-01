class Solution {
    public boolean wordPattern(String pattern, String s) {
        String[] splitted = s.split(" ");

        if (pattern.length() != splitted.length) {
            return false;
        }

        HashMap<Character, String> charToString = new HashMap<>();
        HashMap<String, Character> stringToChar = new HashMap<>();

        for (int i = 0; i < pattern.length(); i++) {
            char currentChar = pattern.charAt(i);
            String currentWord = splitted[i];

            if (!charToString.containsKey(currentChar)) {
                charToString.put(currentChar, currentWord);
            } else if (!charToString.get(currentChar).equals(currentWord)) {
                return false;
            }

            if (!stringToChar.containsKey(currentWord)) {
                stringToChar.put(currentWord, currentChar);
            } else if (!stringToChar.get(currentWord).equals(currentChar)) {
                return false;
            }
        }
        return true;
    }
}