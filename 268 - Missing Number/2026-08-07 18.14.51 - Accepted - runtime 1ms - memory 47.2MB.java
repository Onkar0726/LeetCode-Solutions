class Solution {
    public int missingNumber(int[] nums) {
        int n=nums.length;
        int i =0;
        while(i<nums.length){
            int correct = nums[i];
            if(nums[i] < n && nums[i] != nums[correct]){
            swap(nums,i,correct);
        }

        else{
            i++;
        }
    }

        for (int index = 0; index < n; index++) {
            if (nums[index] != index) {
                return index; 
            }
        }

        return n;
    }static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}

