class Solution {
    public int subarraySum(int[] nums, int k) {
        int n=nums.length;
        int var=0;
        int count=0;
        for(int i=0;i<n;i++){
            var=0;
            for(int j=i;j<n;j++){
                var+=nums[j];
                if(var==k){
            count++;

          }
            }
        }
        return count;
    }
}