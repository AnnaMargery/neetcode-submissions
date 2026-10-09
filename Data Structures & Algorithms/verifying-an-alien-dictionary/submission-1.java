class Solution {
    public boolean isAlienSorted(String[] words, String order) {
        // compare first letters of every word with alphabet - and give an answer- does the queue is
        // correct if does not match- false if there is a match compare the second char

        int[] dict = new int[26];
        int counter = 0;

        for (int i = 0; i < order.length(); i++) {
            dict[order.charAt(i) - 'a'] = counter;
            counter++;
        }

        for (int i = 0; i < words.length - 1; i++) {
            if (!isSorted(words[i], words[i + 1], dict)) {
                return false;
            }
        }
        return true;
    }

    private boolean isSorted(String word1, String word2, int[] dict) {
        int length1 = word1.length();
        int length2 = word2.length();
        int minLen = Math.min(length1, length2);

        for (int i = 0; i < minLen; i++) {
            char char1 = word1.charAt(i);
            char char2 = word2.charAt(i);

            if (char1 != char2) {
                // we need to compare them
                return dict[char1 - 'a'] < dict[char2 - 'a'];
            }
        }
        // if they are the same- compare their length
        return length1 <= length2;
    }
}