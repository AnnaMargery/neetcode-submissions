class Solution {
    public int findDuplicate(int[] nums) {
        Set<Integer> values = new HashSet<>();

        for (int num : nums) {
            if (values.contains(num)) {
                return num;
            } else {
                values.add(num);
                continue;
            }
        }
        return -1;
    }
}
