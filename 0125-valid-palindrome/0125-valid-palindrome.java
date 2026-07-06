class Solution {
    public boolean isPalindrome(String s) {
        String non = "";
        for(int i = 0;i < s.length();i++){
            char c = s.charAt(i);
            if(c>='A' || c<='Z' || c >='a' || c<='z' || c <='0' || c>= '9'){
                if(c>='A' && c<='Z'){
                    char temp = Character.toLowerCase(c);
                    non = non+temp;
                }
                else if( c >='a' && c<='z'){
                    non = non + c;
                }
                else if(c>='0' && c<='9'){
                    non = non+c;
                }
            }
        }
        int l = 0;
        int r = non.length()-1;
        while(l<r){
            char l_c = non.charAt(l);
            char r_c = non.charAt(r);
            if(l_c != r_c) return false;
            r--;
            l++;
        }
        return true;
    }
}