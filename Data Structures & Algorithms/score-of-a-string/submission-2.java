class Solution {
    public int scoreOfString(String s) {
        //Explanation: 
        // The ASCII values of the characters in the given string are: 
        // 'c' = 99, 'o' = 111, 'd' = 100,  and 'e' = 101. 
        // The score of s will be: |111 - 99| + |100 - 111| + |101 - 100|

        char[] chars = s.toCharArray();
        int result = 0;

        for(int i=0; i < s.length()-1; i++){
            result += Math.abs(s.charAt(i)-s.charAt(i+1));
        }
        return result;
    }
}