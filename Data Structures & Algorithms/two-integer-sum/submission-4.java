class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer,Integer> valueToIndex = new HashMap<>();
        
        for(int i = 0; i<nums.length; i++){
            int compl = target - nums[i];
            if(valueToIndex.containsKey(compl) && valueToIndex.get(compl)!= i){
                return new int[]{valueToIndex.get(compl),i};
            }else{
                valueToIndex.put(nums[i],i);
            }

        }
        return new int[]{};
    }
}
