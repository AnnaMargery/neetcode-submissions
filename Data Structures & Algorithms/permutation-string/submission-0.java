class Solution {
    public boolean checkInclusion(String s1, String s2) {
        if (s1.length() > s2.length()) {
            return false;
        }

        int[] target = buildCount(s1);
        int[] window = buildCount(s2.substring(0, s1.length()));

        if (sameCounts(target, window)) {
            return true;
        }

        for (int right = s1.length(); right < s2.length(); right++) {
            addChar(window, s2.charAt(right));
            int left = right - s1.length();
            removeChar(window, s2.charAt(left));
            if (sameCounts(target, window)) {
                return true;
            }
        }
        return false;
    }

    private int[] buildCount(String s) {
        int[] count = new int[26];
        for (char c : s.toCharArray()) {
            count[c - 'a']++;
        }
        return count;
    }

    private boolean sameCounts(int[] a, int[] b) {
        return Arrays.equals(a, b);
    }

    private void addChar(int[] count, char c) {
        count[c - 'a']++;
    }

    private void removeChar(int[] count, char c) {
        count[c - 'a']--;
    }
}
