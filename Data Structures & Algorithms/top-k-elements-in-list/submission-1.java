class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        // nums = [1,2,2,3,3,3], k = 2
        // 1 ->1 , 2 -> 2 , 3-> 3 , so 2,3 are 2 most frequents.
        // ok so we will need to return an array of size k
        int[] result = new int[k];

        // i will create a map to count an occurence of each value
        //  key - number, value- sum of occurences

        Map<Integer, Integer> occurenceMap = new HashMap<>();

        for (int num : nums) {
            occurenceMap.merge(num, 1, Integer::sum);
        }

        // so now i need to check the map values, and compare them
        List<Integer> max =
            occurenceMap.values().stream().sorted(Comparator.reverseOrder()).limit(k).toList();

        // so now i know k- number of values i need to iterate on map

        int index = 0;
        for (Map.Entry<Integer, Integer> entry : occurenceMap.entrySet()) {
            Integer key = entry.getKey();
            Integer value = entry.getValue();
            if (index >= k)
                break;
            if (max.contains(value)) {
                result[index] = key;
                index++;
            }
        }
        return result;
    }
}
