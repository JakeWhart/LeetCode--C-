class Solution {
    public long sumAndMultiply(int n) {
        int x = 0;
        int sum = 0;
        int q = n;
        int t = 0;
        while(n > 0){
            int temp = n % 10;
            if(temp != 0){
                sum+=temp;
                x = x * 10 + temp;
            }
            n/=10;
        }
        while(x>0){
            int temp = x % 10;
            t = t * 10 + temp;
            x/=10;
        }
        return (long) sum * t;

    }
}