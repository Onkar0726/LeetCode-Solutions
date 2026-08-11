class Solution {
    public void rotate(int[] nums, int k) {
       int n=nums.length;
       int temp[]=new int[n];
       int j=0;
       int c=0;
       k = k % n;
       int x=k;
        while( k>0 ){
            temp[j]=nums[n-x+j];
           k--;
           j++; 
        }  
        for(int i=j;i<n;i++ ){
            temp[i]=nums[c];
           c++;
        }
        for (int l=0;l<n;l++) {
         nums[l] = temp[l];
       }
       
    }
}