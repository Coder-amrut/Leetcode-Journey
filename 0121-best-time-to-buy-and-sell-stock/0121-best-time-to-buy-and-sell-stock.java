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
       // int smallest = prices[0];
        // int k=0;
        // //buying prize
        // for(int i=1; i<prices.length; i++){
        //     if(prices[i] < smallest){
        //         smallest = prices[i];
        //         k=i;
        //     }
            
        // }   
        // //selling prize
        // int max = prices[0];
        // for(int j=k; j<prices.length; j++){
        //     if(prices[j] > max){
        //         max = prices[j];
                
        //     }
            
        // }
        // int result = max - smallest;
        // return result;  can u do chage on my code