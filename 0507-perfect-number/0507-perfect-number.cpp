class Solution {
public:
    bool checkPerfectNumber(int num) {
        int sum = 0;
        for(int i = 2; i < num;i++){
            if(num%i==0){
                sum+=i;
            }
        }
        sum+=1;
        return num==sum;
    }
};