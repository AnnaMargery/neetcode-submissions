class Solution {
    public int[] twoSum(int[] nums, int target) {
        
        Map<Integer,Integer> valueIndexPair = new HashMap<>();

        for(int i=0; i<nums.length; i++){
            int compliment = target - nums[i];

            if(valueIndexPair.containsKey(compliment)){
                return new int[]{valueIndexPair.get(compliment),i};
            }
            valueIndexPair.put(nums[i],i);
        }
        return new int[]{};
    }
}
