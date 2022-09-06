
class BestTimeToBuyAndSellStockI {
    
    // Brute Force Approach
    public static int maximumProfitDuringBestTimeToBuyAndSellStock (int[] prices) {

        int maximumProfit = 0;

        for (int buyingPrice = 0; buyingPrice <= prices.length - 1; buyingPrice++) {
            
            for (int sellingPrice = buyingPrice; sellingPrice <= prices.length -1; sellingPrice++) {
                
                int profit = prices[sellingPrice] - prices[buyingPrice];

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