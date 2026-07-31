class Solution {
    public int[] findMissingAndRepeatedValues(int[][] grid) {
        int[] ans = new int[2];

        Map<Integer, Integer> occurrenceMap = new HashMap<>();

        int rows = grid.length;
        int cols = grid[0].length;
        int totalElements = rows * cols;

        for (int[] gr : grid) {
            for (int num : gr) {
                occurrenceMap.put(num, occurrenceMap.getOrDefault(num, 0) + 1);
            }
        }

        for (int i = 1; i <= totalElements; i++) {
            if (!occurrenceMap.containsKey(i)) {
                ans[1] = i;
            }
            else if (occurrenceMap.get(i) == 2) {
                ans[0] = i;
            }
        }
        return ans;
    }
}