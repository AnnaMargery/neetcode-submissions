class Solution {
    public int[] replaceElements(int[] arr) {

        //arr[0] -> 2 compare with 4,5,3,1,2 -> 5
        //arr[1] -> 4 compare with 5,3,1,2 -> 5
        //arr[2] -> 5 compare with 3,1,2 -> 3
        //arr[3] -> 3 compare with 1,2 -> 2
        //arr[4] -> 1 compare with 2 -> 2
        //arr[5] -> 2 insert -1;

        int n = arr.length;
        int[] result = new int[n];

        int rightMax = -1; // the last value

        // we will iterate from the end to to front
        for(int i = n-1; i >=0 ; i--){
            result[i] = rightMax;
            rightMax = Math.max(rightMax,arr[i]);
        }
        return result;
    }
}