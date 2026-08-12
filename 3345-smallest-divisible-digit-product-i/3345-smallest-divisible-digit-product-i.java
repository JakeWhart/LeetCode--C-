class Solution {
    public int smallestNumber(int n, int t) {
       while(true){
        if(product(n) % t == 0){
            return n;
        }
        n++;
       }
}
private int product(int num){
    int product = 1;
    while(num > 0){
        int temp = num % 10;
        product *= temp;
        num /= 10;
    }
    return product;
}
}
