class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        /*
        Problem decomposition:
        - array os strings, where each string is an array od characters
        */
        if (strs.length == 0) {
            return new ArrayList<>();
        }

        Map<String, List<String>> anagrams = new HashMap<>();

        for (int i = 0; i < strs.length; i++) {
            char[] letters = strs[i].toCharArray();
            Arrays.sort(letters);
            String sorted = new String(letters);
            anagrams.computeIfAbsent(sorted, k -> new ArrayList<>()).add(strs[i]);
        }
        return new ArrayList<>(anagrams.values());
    }
}