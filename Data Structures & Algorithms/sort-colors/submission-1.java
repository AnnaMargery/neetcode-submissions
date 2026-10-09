class Solution {
    public void sortColors(int[] nums) {
        int n = nums.length;

        // 0 - red
        // 1 - white
        // 2 - blue

        Map<Integer, Integer> colourCounters = new HashMap<>();

        for (int num : nums) {
            if (num == 0) {
                insertToMap(0, colourCounters);
            } else if (num == 1) {
                insertToMap(1, colourCounters);
            } else {
                insertToMap(2, colourCounters);
            }
        }

        int red = colourCounters.getOrDefault(0, 0);
        int white = colourCounters.getOrDefault(1, 0);
        int blue = colourCounters.getOrDefault(2, 0);

        int currentIndex = 0;

        for (int i = 0; i < red; i++) {
            nums[currentIndex++] = 0;
        }
        for (int i = 0; i < white; i++) {
            nums[currentIndex++] = 1;
        }
        for (int i = 0; i < blue; i++) {
            nums[currentIndex++] = 2;
        }
    }

    private void insertToMap(int num, Map<Integer, Integer> map) {
        map.put(num, map.getOrDefault(num, 0) + 1);
    }
}