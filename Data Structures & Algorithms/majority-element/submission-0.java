class Solution {
    public int majorityElement(int[] nums) {
        Map<Integer, Integer> valueCounter = new HashMap<>();

        int n = nums.length;
        int major = n / 2;

        for (int i = 0; i < nums.length; i++) {
            int count = valueCounter.getOrDefault(nums[i], 0) + 1;
            valueCounter.put(nums[i], count);

            if (count > major) {
                return nums[i];
            }
        }
        return -1;
    }
}