class Solution {
    public boolean checkDivisibility(int n) {
        int add = 0;
        int pro = 1;
        int n1=n;
        while (n != 0) {
            int var = n % 10;
            add += var;
            pro *= var;
            n = n / 10;
        }
        
        if (n1 % (add+pro) == 0) {
            return true;
        }
        return false;
    }
}