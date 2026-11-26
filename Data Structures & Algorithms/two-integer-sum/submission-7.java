class Solution {
    public int[] twoSum(int[] nums, int target) {

        Map<Integer,Integer> valueIndexMap = new HashMap<>();

        for(int i=0; i<nums.length;i++){
            int missing = target - nums[i];

            if(valueIndexMap.containsKey(missing)){
                return new int[]{valueIndexMap.get(missing),i};
            }
            valueIndexMap.put(nums[i],i);

        }
        return new int[]{};
    }
}
