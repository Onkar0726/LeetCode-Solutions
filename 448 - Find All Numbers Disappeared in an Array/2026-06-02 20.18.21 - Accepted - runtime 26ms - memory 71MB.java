class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        Arrays.sort(nums);
         List<Integer> var1 = new ArrayList<>();
        int var=1;
        for(int i=0;i<nums.length;i++){
            if(i>0 && nums[i]==nums[i-1]){
            continue;
            }
            if(nums[i]==var){
                var++;
            }
            else if(nums[i]!=var){
                var1.add(var);
                var++;
                i--;
            }
        }
        while (var <= nums.length) {
            var1.add(var);
            var++;
        }
        return var1;
    }
}