class Solution {
    public int maxProfit(int[] prices) {
        int n=prices.length;
        int minPrice=prices[0];
        int maxP=0;
        if (prices == null || n < 2) {
         return 0;
        }
        for (int i = 1; i < prices.length; i++) {
            if (prices[i] < minPrice) {
                minPrice = prices[i];
            } 
            else {
                int currentP = prices[i] - minPrice;
                maxP = Math.max(maxP, currentP);
            }
        }

        return maxP;
    }
}