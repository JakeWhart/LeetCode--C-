class Solution {
public:
    bool isPalindrome(string s) {
        transform(s.begin(),s.end(),s.begin(),::tolower);
        s = regex_replace(s, regex("[^A-Za-z0-9]"), "");
        int left = 0;
        int right  = s.length()-1;
        bool valid = true;
        while(left<=right){
            if(s[left]!=s[right]){
                valid = false;
                break;
            }
            left++;
            right--;
        }
    return valid;}
};