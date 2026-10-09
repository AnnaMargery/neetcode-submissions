class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums.length ==0) return 0;
        Set<Integer> unique = new TreeSet<>();

        for (int num : nums) { // o(n)
            if (!unique.contains(num)) {
                unique.add(num);
            }
        }
        // unique values, ordered in ASC

        int maxLen = 1;
        int currentLen = 1;
        Integer prev = null;

        for (int num : unique) {
            if (prev != null) {
                if (num == prev + 1) {
                    currentLen++;
                } else {
                    currentLen = 1;
                }
                maxLen = Math.max(maxLen, currentLen);
            }
            prev = num;
        }

        return maxLen;
    }
}
