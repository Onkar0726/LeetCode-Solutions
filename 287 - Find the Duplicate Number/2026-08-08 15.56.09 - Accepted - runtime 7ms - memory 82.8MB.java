class Solution {
    public int findDuplicate(int[] nums) {
        int [ ]var=new int[1];
        int n=nums.length;
        int i=0;
        while(i<nums.length){
            int correct=nums[i]-1;
            if(nums[i] <= n && nums[i] != nums[correct]){
                swap(nums,i,correct);
            }
            else if(nums[i]==nums[correct]){
                var[0]=nums[i];
                i++;
            }
            else{
                i++;
            }
        }
     return var[0];
    }
      public void swap(int []arr,int j,int k){
        int temp=arr[j];
        arr[j]=arr[k];
        arr[k]=temp;
    }
    }
