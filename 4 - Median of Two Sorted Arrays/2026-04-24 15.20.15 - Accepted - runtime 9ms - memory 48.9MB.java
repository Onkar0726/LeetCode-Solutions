class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
    int[] combined = new int[nums1.length + nums2.length];
     // System.arraycopy(source, srcPos, destination, destPos, length)
     System.arraycopy(nums1, 0, combined, 0, nums1.length);
     System.arraycopy(nums2, 0, combined, nums1.length, nums2.length);
     Arrays.sort(combined);
    double median = 0;
     int n = combined.length;
     if(n%2==0){
         median= (combined[n/2]+ combined[(n/2) -1])/2.0;
     }
     else{
        median= combined[n/2];
     }
     return median;
    }
    
}