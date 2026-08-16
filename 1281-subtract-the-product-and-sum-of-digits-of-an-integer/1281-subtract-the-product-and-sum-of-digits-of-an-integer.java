class Solution {
    public int subtractProductAndSum(int n) {
        int sum=0;
        int pro=1;
        int result=0;
        int var=1;
        while(n>=1){
            var=n%10;
            pro*=var;
            sum+=var;
            n=n/10;
        }
        result=pro-sum;
        return result;
    }
}