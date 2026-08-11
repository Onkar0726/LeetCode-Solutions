class Solution {
    public int[] rearrangeArray(int[] nums) {
        int n=nums.length;
        int j=0;
        int p=0;
        int u=0;
        int y=0;
        int temp1[]=new int [n];
        int temp2[]=new int [n];
        int last[]=new int [n];
        for(int i=0;i<n;i++){
            if(nums[i]>=0){
                temp1[u]=nums[i];
                u++;
            }
            else if(nums[i]<0) {
                temp2[j]=nums[i];
                j++;
            }
        }
        for(int k=0;k<n;k+=2){
            last[k]=temp1[p];
            p++;
        }
        for(int a=1;a<n;a+=2){
            last[a]=temp2[y];
            y++;
        }

        System.out.println(Arrays.toString(temp1));
        System.out.println(Arrays.toString(temp2));
        System.out.println(Arrays.toString(last));
        return last;
    }
}