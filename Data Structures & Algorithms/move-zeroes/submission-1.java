class Solution {
    public void moveZeroes(int[] nums) {
        int len = nums.length;
        int index = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) {
                continue;
            } else {
                nums[index] = nums[i];
                index++;
            }
        }

        for (int i = index; i <=nums.length-1; i++) {
            nums[i] = 0;
        }
    }
}