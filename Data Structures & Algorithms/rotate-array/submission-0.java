class Solution {
    public void rotate(int[] nums, int k) {
        int n = nums.length;
        k %= n;

        reverse(nums, 0, n - 1);
        reverse(nums, 0, k - 1);
        reverse(nums, k, n - 1);

        // k is non negative
        // basically we need to count the k from the end of an array
        // Input: nums = [1, 2, 3, 4, 5, 6, 7, 8], k = 4
        //                            4  3  2  1
        // this number will be our fisrt number in rotated array
        // it is basically dividing our array in half, left side is put as a front,
        // right side as a tail
    }

    private void reverse(int[] nums, int left, int right) {
        while (left < right) {
            int temp = nums[left];
            nums[left] = nums[right];
            nums[right] = temp;
            left++;
            right--;
        }
    }
}