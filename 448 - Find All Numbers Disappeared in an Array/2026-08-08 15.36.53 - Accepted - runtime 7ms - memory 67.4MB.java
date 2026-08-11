class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
         List<Integer> var = new ArrayList<>();
        int n=nums.length;
        int i =0;
        while(i<nums.length){
            int correct = nums[i]-1;
            if(nums[i] <= n && nums[i] != nums[correct]){
            swap(nums,i,correct);
        }

        else{
            i++;
        }
    }

        for (int index = 0; index < n; index++) {
            if (nums[index] != index+1) {
                var.add(index+1);
            }
        }
        return var;
    }
    static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
