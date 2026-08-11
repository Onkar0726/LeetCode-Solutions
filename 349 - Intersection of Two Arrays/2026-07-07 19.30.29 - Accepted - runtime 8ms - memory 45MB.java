class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        int count=0;
         int maxSize = Math.max(nums1.length, nums2.length);
        int[] n = new int[nums2.length];
        for(int i=0;i<nums2.length;i++){
            boolean isTargetFound = Arrays.binarySearch(nums1, nums2[i]) >= 0;
            if(isTargetFound){
                  if (count > 0 && n[count - 1] == nums2[i]) {
                    continue; 
                }
             n[count]=nums2[i];
             count++;
            }
        }
         int[] result = new int[count];
        for (int i = 0; i < count; i++) {
            result[i] = n[i];
        }
        System.out.println(Arrays.toString(result));
        return result;

    }
    }