class Solution {
    public int maxProfit(int[] prices) {

        int mpd = Integer.MAX_VALUE;
        int op=0, psd =0;

        for(int i=0 ; i < prices.length ; i++){

            if(prices[i] < mpd)
                mpd = prices[i];

            psd = prices[i] - mpd;

            if( op < psd)
                op = psd;
        }
        return op;
        
    }

}
