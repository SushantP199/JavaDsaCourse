
public class BestTimeToBuyAndSellStockII {
    
    // Auxiliary Array Approach
    public static int maximumProfitDuringBestTimeToBuyAndSellStock (int[] prices) {

        int[] maxSellingPriceInFutureAtCurrentBuyingPrice = new int[prices.length];

        maxSellingPriceInFutureAtCurrentBuyingPrice[prices.length - 1] = prices[prices.length - 1];
        for (int index = prices.length - 2; index >= 0; index--) {
            maxSellingPriceInFutureAtCurrentBuyingPrice[index] = Math.max(prices[index], maxSellingPriceInFutureAtCurrentBuyingPrice[index + 1]);
        }

        int maximumProfit = 0;
        for (int index = 0; index <= prices.length - 1; index++) {
            
            int profit = maxSellingPriceInFutureAtCurrentBuyingPrice[index] - prices[index];

            maximumProfit = Math.max(profit, maximumProfit);
        }

        return maximumProfit;
    }

    public static void main(String[] args) {
        
        int[] prices = {7, 1, 5, 3, 6, 4};

        int maximumProfitDuringBestTimeToBuyAndSellStock = maximumProfitDuringBestTimeToBuyAndSellStock(prices);
        
        System.out.println("The maximum profit during best time buy and sell stock is " + maximumProfitDuringBestTimeToBuyAndSellStock);
    }
}
