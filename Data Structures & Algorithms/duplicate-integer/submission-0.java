class Solution {
    public boolean hasDuplicate(int[] nums) {
        Set<Integer> values = new HashSet<>();

        for (int number : nums) {
            if (!values.add(number)) {
                return true;
            }
        }
        return false;
    }
}