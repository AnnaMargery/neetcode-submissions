class Solution {
    public int majorityElement(int[] nums) {
        int n = nums.length;
        int majorityLvl = (n / 2);

        Map<Integer, Integer> occurenceCounter = new HashMap<>();

        for (int num : nums) {
            occurenceCounter.merge(num, 1, Integer::sum);
            if (occurenceCounter.get(num) > majorityLvl) {
                return num;
            }
        }
        return -1;
    }
}