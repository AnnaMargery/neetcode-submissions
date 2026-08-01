class Solution {
    public int[] productExceptSelf(int[] nums) {
        //    Input:  [1,2,4,6]
        //    Output: [48,24,12,8]
        // output[0] = 2 * 4 * 6 = 48
        // output[1] = 1 * 4 * 6 = 24
        // output[2] = 1 * 2 * 6 = 12
        // output[3] = 1 * 2 * 4 = 8

        // Brut force

        int n = nums.length;
        int[] result = new int[n];

        for (int i = 0; i < n; i++) {
            int mult = 1;
            for (int j = 0; j < n; j++) {
                if (i != j) {
                    mult *= nums[j];
                }
            }
            result[i] = mult;
        }
        return result;
    }
}
