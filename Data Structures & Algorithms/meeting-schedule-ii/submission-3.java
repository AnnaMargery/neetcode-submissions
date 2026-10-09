/**
 * Definition of Interval:
 * public class Interval {
 *     public int start, end;
 *     public Interval(int start, int end) {
 *         this.start = start;
 *         this.end = end;
 *     }
 * }
 */

class Solution {
    public int minMeetingRooms(List<Interval> intervals) {
        if (intervals == null || intervals.size() == 0)
            return 0;

        intervals.sort(Comparator.comparingInt(interval -> interval.start));

        PriorityQueue<Integer> booking = new PriorityQueue<>();
        booking.offer(intervals.get(0).end);

        for (int i = 1; i < intervals.size(); i++) {
            Interval current = intervals.get(i);

            if (booking.peek() <= current.start) {
                booking.poll();
            }
            booking.offer(current.end);
        }

        return booking.size();
    }
}
