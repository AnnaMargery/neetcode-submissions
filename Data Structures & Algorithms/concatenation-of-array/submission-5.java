class Solution {
    public int[] getConcatenation(int[] nums) {

        int numsLength = nums.length;
        int[] result = new int[2*numsLength];

        for(int i = 0; i<numsLength;i++){
            result[i] = nums[i];
            result[i+numsLength] = nums[i];
        }
        return result;
    }
}