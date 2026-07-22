class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        // nums1, nums2 sorted in asc order
        // n - number of elements in num2
        // m - number of valid elements in num1

        // basically nums1 have filled numbers,
        // when number of m is the number of numbers different than 0
        //  and n empty numbers

        int k = nums1.length - 1;
        for (int i = 0; i < n; i++) {
            nums1[i + m] = nums2[i];
            k--;
        }
        Arrays.sort(nums1);
    }
}