class Solution {
    public int lengthOfLastWord(String s) {
        if (s == null || s.isBlank()) {
            return 0;
        }
        String[] prepared = s.trim().split(" ");
        List<String> cleared = new ArrayList<>();

        for (String word : prepared) {
            if (!word.isEmpty()) {
                cleared.add(word);
            }
        }
        return cleared.getLast().length();
    }
}