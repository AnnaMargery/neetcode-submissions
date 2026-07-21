class Solution {
    public int maxNumberOfBalloons(String text) {

        Map<Character,Integer> balloon = new HashMap<>();
        for(char c : "balloon".toCharArray()){
            balloon.put(c,balloon.getOrDefault(c,0)+1);
        }
        // i have a balloon map now i need to create a map from words

        Map<Character,Integer> countLetters = new HashMap<>();
        for(char c : text.toCharArray()){
            countLetters.put(c, countLetters.getOrDefault(c,0)+1);
        }

        // i have a map with chars and their occurence counts in text, now i need to compare
        // i have a ballloon map, so i can divide text map by it, to check the result.
        int result = text.length();
        for(char c: balloon.keySet()){
            result = Math.min(result,countLetters.getOrDefault(c,0)/balloon.get(c));
        }
        return result;
    }
}