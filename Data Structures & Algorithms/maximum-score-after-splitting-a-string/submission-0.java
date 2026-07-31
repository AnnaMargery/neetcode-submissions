class Solution {
    public int maxScore(String s) {
        // left String- we are counting 0
        // right String we are counting 1
        int totalOnes = 0;

        for (char c : s.toCharArray()) {
            if (c == '1')
                totalOnes++;
        }

        int leftZeros = 0;
        int rightOnes = totalOnes;
        int max = 0;

        for (int i = 0; i < s.length() - 1; i++) {
            char c = s.charAt(i);
            if (c == '0') {
                leftZeros++;
            } else {
                rightOnes--;
            }

            max = Math.max(max, leftZeros + rightOnes);
        }
        return max;
    }
}