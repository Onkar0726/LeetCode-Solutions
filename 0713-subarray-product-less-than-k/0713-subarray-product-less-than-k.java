class Solution {
    public int numSubarrayProductLessThanK(int[] nums, int k) {
        int n = nums.length;
        int l = 0;
        int pro = 1;
        int count = 0;
        //edge case 
           if (k <= 1) {
            return 0;
        }
        for (int r = 0; r < n; r++) {
            pro *= nums[r];
            while (pro >= k) {
                pro = pro / nums[l];
                l++;
            }
            count = count + (r - l + 1);
        }
        return count;
    }
}
