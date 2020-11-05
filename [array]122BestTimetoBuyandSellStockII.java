class Solution {
    public int maxProfit(int[] prices) {
        int profit =0;
        
        //if have profit, then sum
        for(int i=1; i< prices.length; i++){
            profit += Math.max(0, prices[i] - prices[i-1]);
        }
        
        return profit;
    }
}
