public class Q3 {
    
    public static int maximumProfit (int[] prices) {

        int minimumBuyingPriceInRecordAtCurrentSellingPrice = prices[0];
        int maximumProfit = 0;

        for (int i = 0; i < prices.length; i++) {
            
            minimumBuyingPriceInRecordAtCurrentSellingPrice = Math.min(minimumBuyingPriceInRecordAtCurrentSellingPrice, prices[i]);
            
            int profit = prices[i] - minimumBuyingPriceInRecordAtCurrentSellingPrice;

            maximumProfit = Math.max(profit, maximumProfit);
        }

        return maximumProfit;
    }

    public static void displayArray(int[] array) {
        for (int index = 0; index < array.length; index++) {
            System.out.print(array[index] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        
        // int[] prices = {7, 1, 5, 3, 6, 4};
        int[] prices = {7, 6, 4, 3, 1};

        System.out.print("Array : ");
        displayArray(prices);

        System.out.println("The maximum profit during best time buy and sell stock is " + maximumProfit(prices));

    }
}
