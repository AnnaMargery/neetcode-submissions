class Solution {
    public int majorityElement(int[] nums) {
        int investigated = 0;
        int counter = 0;

        for (int num : nums) {
            if(counter ==0) investigated = num;
            if (investigated == num) {
                counter++;
            } else {
                counter--;
            }
        }
        return investigated;
    }
}