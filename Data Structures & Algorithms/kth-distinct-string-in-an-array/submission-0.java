class Solution {
    public static String kthDistinct(String[] arr, int k) {
        // i'm considering a map, where key is a string, and value is a number of occurence
        Map<String, Integer> strs = new HashMap<>();

        for (String s : arr) {
            strs.put(s, strs.getOrDefault(s, 0) + 1);
        }

        int counter = 0;
        for (int i = 0; i < arr.length; i++) {
            if (strs.get(arr[i]) == 1) {
                counter++;
                if (counter == k) {
                    return arr[i];
                }
            }
        }
        return "";
    }
}