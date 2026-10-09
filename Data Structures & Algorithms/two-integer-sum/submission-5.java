class Solution {
    public int[] twoSum(int[] nums, int target) {
        if(nums == null || nums.length < 2) return new int[]{};

       Map<Integer,Integer> prevMap = new HashMap<>();

       for(int i = 0; i<nums.length; i++){
        int num = nums[i];
        int missing = target - num;
        if(prevMap.containsKey(missing)){
            return new int[]{prevMap.get(missing),i};
        }
        prevMap.put(num,i);
       }
        return new int[]{};
    }
}
