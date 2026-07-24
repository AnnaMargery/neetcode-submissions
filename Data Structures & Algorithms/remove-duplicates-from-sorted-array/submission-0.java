class Solution {
    public int removeDuplicates(int[] nums) {
        if(nums.length == 1) return nums.length;

        TreeSet<Integer> values = new TreeSet<>();

        for(int i = 0; i<nums.length; i++){
            values.add(nums[i]);
        }

        int i=0;
        for(int num :values){
            nums[i++] = num;
        }
        return values.size();
    }
}