class Solution {
    public List<Integer> majorityElement(int[] nums) {

        int n = nums.length;
        int majorLimit = n/3; // ??? 

        List<Integer> result = new ArrayList<>();

        Map<Integer,Integer> occurences = new HashMap<>();

        for(int num : nums){
            occurences.merge(num,1,Integer::sum);
        }

        for(Map.Entry<Integer,Integer> entry: occurences.entrySet()){
            Integer key = entry.getKey();
            Integer value = entry.getValue();

            if(value > majorLimit){
                result.add(key);
            }
        }
        return result;
    }
}