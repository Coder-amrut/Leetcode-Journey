class Solution {
    public int maxProfit(int[] prices) {
        int smallest = prices[0];
        int result = 0;

        for (int i = 1; i < prices.length; i++) {

            if (prices[i] < smallest) {
                smallest = prices[i];
            }

            if (prices[i] - smallest > result) {
                result = prices[i] - smallest;
            }
        }

        return result;
    }
}