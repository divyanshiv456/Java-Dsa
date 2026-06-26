public class bellandsell {

    public static int BuyAndSellStocks(int prices[]) {
        int buyStocks = Integer.MAX_VALUE;
        int maxprofit = 0;

        for (int i = 0; i < prices.length; i++) {
            if (buyStocks < prices[i]) {
                int profit = prices[i] - buyStocks;
                maxprofit = Math.max(maxprofit, profit);
            } else {
                buyStocks = prices[i];
            }
        }
        return maxprofit;
    }

    public static void main(String[] args) {
        int prices[] = { 7, 1, 5, 3, 6, 4 };
        System.out.println(BuyAndSellStocks(prices));
    }
}
