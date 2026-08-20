class Solution {
    public int[] resultArray(int[] nums) {
        int n = nums.length;
        int arr1[] = new int[n];
        int arr2[] = new int[n];
        arr1[0] = nums[0];
        arr2[0] = nums[1];
        int ind1=1;
        int ind2=1;
        for (int i = 2; i < n; i++) {
            if (arr1[ind1 - 1] > arr2[ind2- 1]) {
                arr1[ind1] = nums[i];
                ind1++;
            } else {
                arr2[ind2] = nums[i];
                ind2++;
            }
        }
        int result[] = new int[ind1+ ind2];
        System.arraycopy(arr1, 0, result, 0, ind1);
        System.arraycopy(arr2, 0, result, ind1, ind2);
        return result;
    }
}