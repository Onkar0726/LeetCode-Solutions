class Solution {
    public List<Integer> findDuplicates(int[] nums) {
         List<Integer> var1 = new ArrayList<>();
         Arrays.sort(nums);
        int n=nums.length;
        for(int i=1 ;i<=n-1;i++){
            if(nums[i]==nums[i-1]){
            var1.add(nums[i-1]);
            }
            
        }
  return var1;
    }
}