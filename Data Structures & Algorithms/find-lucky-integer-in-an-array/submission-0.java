class Solution {
    public int findLucky(int[] arr) {
        // lucky in f.e. number 3 is lucky when it occurs 3 times

        Map<Integer,Integer> occurence = new HashMap<>();

        for(int i = 0; i< arr.length; i++){
            occurence.merge(arr[i],1,Integer::sum);
        }

        List<Integer> luckyNums = new ArrayList<>();

        for(Map.Entry<Integer,Integer> entry: occurence.entrySet()){
            Integer key = entry.getKey();
            Integer value = entry.getValue();
            if(key==value){
               luckyNums.add(key);
            }
        }

        if(luckyNums.isEmpty()){
            return -1;
        } else {
            luckyNums.sort(Comparator.naturalOrder());
            return luckyNums.getLast();
        }
    }
}