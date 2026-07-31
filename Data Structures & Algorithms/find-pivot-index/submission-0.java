class Solution {
    public int pivotIndex(int[] nums) {
        int total = Arrays.stream(nums).sum();
        int left = 0;

        for (int i = 0; i < nums.length; i++) {
            int right = total - left - nums[i];
            if (left == right) {
                return i;
            } else {
                left += nums[i];
            }
        }
        return -1;
    }
}