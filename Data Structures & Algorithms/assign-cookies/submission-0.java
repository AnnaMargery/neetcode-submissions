class Solution {
    public int findContentChildren(int[] g, int[] s) {

        Arrays.sort(g);
        Arrays.sort(s);

        // j -cookie , s array is for cookie
        // i - children, g array is for children

       int i = 0;
       for(int j = 0; i < g.length && j < s.length; j++){
         if(g[i] <= s[j]){
            i++;
         }
       }
       return i;
    }
}