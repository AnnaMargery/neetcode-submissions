class Solution {
    public int[] twoSum(int[] numbers, int target) {
        // array is sorted ASC
        //  return indexes must be 1-based, so add +1 to index from an Array
        //  INDEX1< INDEX2 AND INDEX1 != INDEX2

        int left = 0;
        int right = numbers.length - 1;

        while (left < right) {
            int currentSum = numbers[left] + numbers[right];
            if (currentSum == target) {
                return new int[] {left + 1, right + 1};
            } else if (currentSum < target) {
                left++;
            } else {
                right--;
            }
        }
        return new int[] {};
    }
}
