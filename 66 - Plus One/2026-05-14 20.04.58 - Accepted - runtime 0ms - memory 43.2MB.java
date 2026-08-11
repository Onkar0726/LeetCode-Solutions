class Solution {
    public int[] plusOne(int[] digits) {
        int n=digits.length;
        for(int i=1;i<=n;i++){
            if(digits[n-i]==9){
                digits[n-i]=0;
                
            }
            else {
               digits[n-i] = digits[n-i] + 1;
                return digits;
            }
            
        }
        int newArray[] = new int[n + 1];
        newArray[0] = 1;
        return newArray;
    }
}