class Solution {
public:
    int xorOperation(int n, int start) {
        int last  = 0;
    for(int i = 0; i < n;i++){
        last ^= (start + 2 * i);
    }
        return last;}
};