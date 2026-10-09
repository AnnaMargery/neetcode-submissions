class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        if (nums.length == 1)
            return false;

        // [1,2,3,1]-> k = 3
        // nums[0] == nums[3]
        // Math.abs(0-3) <= 3 -> true

        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int key = nums[i];
            if (map.containsKey(key) && i - map.get(key) <= k) {
                return true;
            }
            map.put(nums[i], i);
        }
        return false;
    }
}