package problems.medium;

public class BestTimeToBuyAndSellStockII {
    public static void main(String[] args) {
        int[] prices = {7, 1, 5, 3, 6, 4};
        int maxProfit = maxProfit(prices);
        System.out.println(maxProfit);
    }

    public static int maxProfit(int[] prices) {
        int max = 0;

        // buying price
        int buy = prices[0];

        // iterate from the second index and compare with prev
        for (int i = 1; i < prices.length; i++) {
            if (buy < prices[i]) {
                max += prices[i] - buy;
            }

            // buy a new stock to compare with the next
            buy = prices[i];
        }

        return max;
    }
}
