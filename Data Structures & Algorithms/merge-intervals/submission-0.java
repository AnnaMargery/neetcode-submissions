class Solution {
    public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals, Comparator.comparingInt(a -> a[0]));
        // now we have sorted, so we can compare start with end and check if they overlap

        List<int[]> result = new ArrayList<>();
        result.add(intervals[0]);

        for (int[] interval : intervals) {
            int start = interval[0];
            int end = interval[1];
            // if end of previous is greater or equal than start to next one they are overlapping
            // and we need to merge them, so start first with the end of the second
            int lastEnd = result.get(result.size() - 1)[1];

            if (lastEnd >= start) {
                result.get(result.size() - 1)[1] = Math.max(lastEnd, end);
            } else {
                result.add(new int[] {start, end});
            }
        }
        return result.toArray(new int[result.size()][]);
    }
}
