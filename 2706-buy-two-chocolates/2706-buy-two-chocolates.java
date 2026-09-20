class Solution {
    public int buyChoco(int[] prices, int money) {
        int smallest = Integer.MAX_VALUE;
        int second = Integer.MAX_VALUE;
        for (int i=0;i<prices.length;i++){
            if (prices[i]<smallest){
                second=smallest;
                smallest=prices[i];
            }
            else if(prices[i]<second){
                second=prices[i];
            }
        }
        if (smallest+second>money){
            return money;
        }
        return money-second-smallest;
    }
}