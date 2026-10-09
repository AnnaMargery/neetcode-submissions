class Solution {
    public boolean hasDuplicate(int[] nums) {
        if (nums == null || nums.length == 1)
            return false;

        Set<Integer> numbers = new HashSet<>();

        for (int num : nums) {
            if (numbers.contains(num)) {
                return true;
            } else {
                numbers.add(num);
            }
        }
        return false;
    }
}