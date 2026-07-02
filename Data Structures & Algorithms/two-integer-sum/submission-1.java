class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> valueToIndex = new HashMap<>();
        int[] indexes = new int[2];

        for (int i = 0; i < nums.length; i++) {
            int compliment = target - nums[i];
            if (valueToIndex.containsKey(compliment)) {
                indexes[0] = valueToIndex.get(compliment);
                indexes[1] = i;
                break;
            }
            valueToIndex.put(nums[i], i);
        }
        return indexes;
    }
}
