class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        if(nums==null || nums.length==0){
            return 0;
        }

        int counter = 0;
        int maxSeen = 0;

        for(int i = 0; i<nums.length; i++){
            if(nums[i]==1){
                counter++;
                maxSeen = Math.max(maxSeen, counter);
            } else {
                counter = 0;
            }
        }
        return maxSeen;
    }
}