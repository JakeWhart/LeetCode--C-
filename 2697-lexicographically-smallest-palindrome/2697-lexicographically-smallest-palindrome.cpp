class Solution {
public:
    string makeSmallestPalindrome(string s) {
        int first = 0;
        int last = s.length()-1;
        while(first<last){
            char c = min(s[last],s[first]);
            s[first] = c;
            s[last] = c;
            last--;
            first++;
        }
    return s ;}
};