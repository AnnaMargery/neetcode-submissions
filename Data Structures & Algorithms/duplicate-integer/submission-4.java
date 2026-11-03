class Solution {
    public boolean hasDuplicate(int[] nums) {
 if(nums==null || nums.length==0) return false;

    Set<Integer> values = new HashSet();

    for(int num:nums){
        if(!values.add(num)){
            return true;
        }
    }
    return false;
    }
}