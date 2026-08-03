class Solution {
    public int calPoints(String[] operations) {
        Deque<Integer> stck = new ArrayDeque<>();

        for (String str : operations) {
            if (str.equals("+") && !stck.isEmpty()) {
                int top1 = stck.pop(); 
                int top2 = stck.peek(); 
                int sum = top1 + top2; 
                stck.push(top1); 
                stck.push(sum); 
            }
            else if (str.equals("C") && !stck.isEmpty()) {
                stck.pop();
            }
            else if (str.equals("D") && !stck.isEmpty()) {
                stck.push(stck.peek() * 2);
            }
            else {
                stck.push(Integer.parseInt(str));
            }
        }
        int result = 0;

        while (!stck.isEmpty()) {
            result += stck.pop();
        }
        return result;
    }
}