class Solution {
    public int largestAltitude(int[] gain) {
        int max=0;
        int n=gain.length;
        int mMax=0;
         int alt[]=new int[n+1];
        for(int i=1;i<=n;i++){
            alt[0]=0;
            alt[i]=alt[i-1]+gain[i-1];
            if(alt[i]>alt[i-1]){
                max=alt[i];
                mMax=Math.max(mMax,max);
            }
        }
        return mMax;
    }
}