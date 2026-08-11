class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        per(nums, 0, ans);
        return ans;
    }

    public void per(int nums[], int idx, List<List<Integer>> ans) {
        int n = nums.length;
        if (idx == n) {
            List<Integer> nlist = new ArrayList<>();
            for (int num : nums){
                nlist.add(num);
            }
            ans.add(nlist);
            return;
        }
        for (int i = idx; i < n; i++) {
            swap(nums,idx,i);
            per(nums,idx + 1, ans);
            swap(nums,idx,i);
        }
    }

    void swap(int[]nums,int a,int b){
        int temp =nums[a];
        nums[a]=nums[b];
        nums[b]=temp;
    }
}

