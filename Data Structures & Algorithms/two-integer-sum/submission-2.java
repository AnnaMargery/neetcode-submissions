class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> numbers = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int num = nums[i];
            int diff = target - num;

            if (numbers.containsKey(diff)) {
                return new int[]{numbers.get(diff), i};
            }
            numbers.put(num, i);
        }
        return new int[] {};
    }
}
