class Solution {
    public int maxSubArray(int[] nums) {
        int temp=0;
        int max=nums[0];
       for(int i=0;i<nums.length;i++){
          temp=temp+nums[i];
          max=Math.max(temp,max);
          if(temp<0){
            temp=0;
          }
       } 
    //    if(nums.length==1){
    //     return nums[nums.length-1];
    //    }
       return max;
    }
}