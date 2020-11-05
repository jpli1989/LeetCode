class Solution {
    public int maxProfit(int[] prices) {
        int maxProfit = 0;
        int sell =0, buy =0;
        
        for(; sell< prices.length; sell++){
            if(prices[sell] < prices[buy]){
                //find the new smaller buying price
                buy = sell;
            }else{
                maxProfit = Math.max(maxProfit, prices[sell] - prices[buy]);
            }
        }
        
        
        return maxProfit;
    }
}
