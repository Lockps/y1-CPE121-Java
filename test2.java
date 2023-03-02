class Solution {
    public int maxProfit(int[] prices) {
        int samp = Integer.MAX_VALUE;
        int value = 0;
        int x = 0;
        for (int i = 0; i < prices.length; i++) {
            if (prices[i] < samp)
                samp = prices[i];
            value = prices[i] - samp;
            if (x < value)
                x = value;
        }
        return value;
    }
}