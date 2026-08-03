class Solution {
    public int findLucky(int[] arr) {
        // lucky in f.e. number 3 is lucky when it occurs 3 times

        Map<Integer,Integer> occurence = new HashMap<>();

        for(int i = 0; i< arr.length; i++){
            occurence.merge(arr[i],1,Integer::sum);
        }

        int lucky = -1;

        for(Map.Entry<Integer,Integer> entry: occurence.entrySet()){
            Integer number = entry.getKey();
            if(number.equals(entry.getValue())){
               lucky = Math.max(lucky,number);
            }
        }
        return lucky;
    }
}