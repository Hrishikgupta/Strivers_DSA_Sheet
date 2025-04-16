package ArrayQuestion.Medium;
//https://leetcode.com/problems/best-time-to-buy-and-sell-stock/description/
public class StockBuyAndSell {
    public static void main(String[] args) {
        int[] prices = {7,1,5,3,6,4};
        System.out.println(maxProfit(prices));
    }
    public static int maxProfit(int[] prices) {
        int maxPrice = 0;
        int minPrice = Integer.MAX_VALUE;
        for(int i=0;i<prices.length;i++){
            minPrice = Math.min(minPrice,prices[i]);
            maxPrice = Math.max(maxPrice,prices[i]-minPrice);
        }
        return maxPrice;
    }
}
