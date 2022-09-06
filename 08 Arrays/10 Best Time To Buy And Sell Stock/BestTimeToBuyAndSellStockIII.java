
public class BestTimeToBuyAndSellStockIII {
    
    // Optimized Approach With Time Complexity O(n)
    public static int maximumProfitDuringBestTimeToBuyAndSellStock (int[] prices) {

        int minimumBuyingPriceInRecordAtCurrentSellingPrice = prices[0];
        int maximumProfit = 0;

        for (int index = 0; index <= prices.length - 1; index++) {
            
            if (minimumBuyingPriceInRecordAtCurrentSellingPrice > prices[index]) {
                minimumBuyingPriceInRecordAtCurrentSellingPrice = prices[index];
            } else {
                int profit = prices[index] - minimumBuyingPriceInRecordAtCurrentSellingPrice;
                maximumProfit = Math.max(profit, maximumProfit);
            }
        }

        return maximumProfit;
        
    }

    public static void main(String[] args) {
        
        int[] prices = {7, 1, 5, 3, 6, 4};

        int maximumProfitDuringBestTimeToBuyAndSellStock = maximumProfitDuringBestTimeToBuyAndSellStock(prices);
        
        System.out.println("The maximum profit during best time buy and sell stock is " + maximumProfitDuringBestTimeToBuyAndSellStock);
    }
}
