class Solution {
    public int[] sortArrayByParity(int[] nums) {
        int[] result = new int[nums.length];
        int j = 0;
        int k = result.length - 1;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] % 2 == 0) {
                result[j] = nums[i];
                j++;
            } else {
                result[k] = nums[i];
                k--;
            }
        }
        return result;
    }
}