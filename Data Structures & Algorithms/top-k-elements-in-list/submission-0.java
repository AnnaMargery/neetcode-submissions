class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        /*
        Problem decomposition:
        - i have an array, with min 1 element and numbers which can be duplicated inside
        - i have a k number - how many of numbers which are most frequent inside an array i need to
        return
        - i should return an array

        if k = 3 what i should return here: [1,2,2,3,3,3] -> [1,2,3] ?

        First approach:
        - iterate threw nums and put numbers and at the same count at the same time,
        - create a HashMap<Integer,Integer> - when we will have number as a key, and counter of
        presence
        - after i should compare those counts, and return k- the biggest
        */

        Map<Integer, Integer> numberToCounter = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            numberToCounter.put(nums[i], numberToCounter.getOrDefault(nums[i], 0) + 1);
        }

        // we can use a list to store our pairs, and sort this list by max values
        //values, number
        List<int[]> arr = new ArrayList<>();
        for(Map.Entry<Integer,Integer> entry : numberToCounter.entrySet() ){
            arr.add(new int[]{entry.getValue(), entry.getKey()});
        }
        arr.sort((a,b)-> b[0]-a[0]);

        int[] result = new int[k];
        for(int i=0; i<result.length; i++){
            result[i] = arr.get(i)[1];
        }
        return result;
    }
}
