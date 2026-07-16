class Solution {
    public boolean validPalindrome(String s) {
       int left = 0;
       int right = s.length()-1;
       while (left < right) {
            if (s.charAt(left) != s.charAt(right)) {

                return ispalindrome(s.substring(left + 1, right + 1)) ||
                       ispalindrome(s.substring(left, right));
            }

            left++;
            right--;
        }

       return true;
       }
    

    private boolean ispalindrome(String temp){
        int left = 0;
        int right = temp.length()-1;
       while(left<right){
             if(temp.charAt(left)!=temp.charAt(right)){
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}