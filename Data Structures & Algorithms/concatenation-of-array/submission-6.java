class Solution {
    public int[] getConcatenation(int[] nums) {
        if(nums== null) return new int[]{};

       // Input: nums = [1,4,1,2]  n=4 , 
       // Output: [1,4,1,2,1,4,1,2] n= 8 

        int n = nums.length;
        int[] result = new int[2*n];

        for(int i=0; i< nums.length; i++){
            result[i]= nums[i];
            result[i+n] = nums[i];
        }
        return result;
    }
}