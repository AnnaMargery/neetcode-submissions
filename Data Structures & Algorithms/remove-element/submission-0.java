class Solution {
    public int removeElement(int[] nums, int val) {
        // in nums = [3,2,2,3], val = 3
        //  out nums.length - k =2, because nums = [2,2];

        // i need to iterate through nums and check if nums[i]== val?
        // if yes i need to remove it from an array- so basically swap indexes,

        int j = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                nums[j++] = nums[i];
            }
        }
        return j;
    }
}