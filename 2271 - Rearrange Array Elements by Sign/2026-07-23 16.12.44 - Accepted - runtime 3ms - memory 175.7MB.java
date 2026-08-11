class Solution {
    public int[] rearrangeArray(int[] nums) {
        int n=nums.length;
       int p=0;
       int ne=1;
        int last[]=new int [n];
         for(int k=0;k<n;k++){
            if(nums[k]>0) {
                last[p] = nums[k];
                p+=2;
            }
            else{
                last[ne]=nums[k];
                ne+=2;
            }
        }
        return last;
    }
}