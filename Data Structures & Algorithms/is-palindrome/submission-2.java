class Solution {
    public static boolean isPalindrome(String s) {

    StringBuilder cleaned = new StringBuilder();

    for(char c : s.toCharArray()){
        if(Character.isLetterOrDigit(c)){
            cleaned.append(Character.toLowerCase(c));
        }
        continue;
    }
    
    s = cleaned.toString();

    int left = 0;
    int right = s.length() - 1;

    while(left < right){
        if(s.charAt(left) != s.charAt(right)){
            return false;
        }
        left++;
        right--;
    }

      return true;
    }
}
