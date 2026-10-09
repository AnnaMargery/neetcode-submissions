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
    public boolean canAttendMeetings(List<Interval> intervals) {
        if (intervals.size() == 0 || intervals.size() == 1)
            return true;

        // we need to sort list, exaclty sort start time, to be able to compare

        intervals.sort(Comparator.comparingInt(interval -> interval.start));

        // if first end >= next start it means that there is a conflict

        for (int i = 1; i < intervals.size(); i++) {
            Interval first = intervals.get(i - 1);
            Interval current = intervals.get(i);
            // compare their end/start
            if (first.end > current.start)
                return false;
        }
        return true;
    }
}
