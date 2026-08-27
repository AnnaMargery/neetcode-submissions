class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        List<Integer> flatted = new ArrayList<>();

        for (int[] row : matrix) {
            for (int val : row) {
                flatted.add(val);
            }
        }

        int left = 0;
        int right = flatted.size() - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (flatted.get(mid) < target) {
                left = mid + 1;
            } else if (flatted.get(mid) > target) {
                right = mid - 1;
            } else {
                return true;
            }
        }
        return false;
    }
}
