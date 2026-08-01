class Solution {
    public static List<List<String>> groupAnagrams(String[] strs) {
        // if we will sort characters in words- we can easily compare them, because they will be
        // equal  to each other
        // then this will be common part for those words, can be a key in a map, values would be
        // collection of words (after sorting they are like key)

        Map<String, List<String>> anagrams = new HashMap<>();

        // so we need to iterate strs and each word convert do a chararray and after that sort them
        // and put as a key into a map

        for (int i = 0; i < strs.length; i++) {
            char[] letters = strs[i].toCharArray();
            Arrays.sort(letters);
            String keyWord = new String(letters);
            anagrams.computeIfAbsent(keyWord, k -> new ArrayList()).add(strs[i]);
        }
        return new ArrayList<>(anagrams.values());
    }
}
