class Solution {
    public int numOfSubarrays(int[] arr, int k, int threshold) {
        int n = arr.length;
        int sum = 0;
        int count = 0;
        int l = 0;
        int r = k - 1;
        int avg = 0;
        for (int i = 0; i < k; i++) {
            sum += arr[i];
        }
        while (r < n) {
            avg = sum / k;
            if (avg >= threshold) {
                count++;
            }
            sum = sum - arr[l];
            l++;
            r++;
            if (r < n) {
                sum += arr[r];
            }
        }
        return count;
    }
}