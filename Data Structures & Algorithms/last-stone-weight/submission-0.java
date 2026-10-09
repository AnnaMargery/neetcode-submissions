class Solution {
    public int lastStoneWeight(int[] stones) {
        // stone[i]- stone's weight
        //  find 2 heaviest (x,y)!
        //  if x==y- destory both
        //  x< y -> stone x is destroyed, and stone y weight = y-x
        // RETURN the weight of the last stone/ 0 otherwise

        // example: stones = [2,3,6,2,4]
        // 2 heaviest - 6, 4, 6 is gone, 4 became 2 // -> stones = [2,3,2,2]
        // 3,2 - 3 is gone, 1 -> stones = [1,2,2]
        // 2,2 -> stones [1]

        PriorityQueue<Integer> stonesQueue = new PriorityQueue<>(Collections.reverseOrder());

        for (int stone : stones) {
            stonesQueue.offer(stone);
        }

        while (stonesQueue.size() > 1) {
            int x = stonesQueue.poll();
            int y = stonesQueue.poll();
            if (x > y) {
                stonesQueue.offer(x - y);
            }
        }
        return stonesQueue.isEmpty() ? 0 : stonesQueue.poll();
    }
}
