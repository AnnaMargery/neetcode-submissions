class Solution {
    public boolean hasDuplicate(int[] nums) {
        Set<Integer> values = new HashSet<>();

        for (int num : nums) {
            if (values.contains(num)) {
                return true;
            } else {
                values.add(num);
            }
        }
        return false;
    }
}