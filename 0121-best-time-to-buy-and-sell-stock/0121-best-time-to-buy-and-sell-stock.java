class Solution {
    public int maxProfit(int[] prices) {
        int[] sp=new int[prices.length];
        int[] bp=new int[prices.length];
        bp[0]=prices[0];
        sp[prices.length-1]=prices[prices.length-1];
        for(int i=0;i<prices.length;i++){
            if(i!=0)
                bp[i]=Math.min(bp[i-1],prices[i]);
            if(i!=prices.length-1)
                sp[i]=Math.max(sp[i+1],prices[i]);
        }
        int maxProfit=0;
        for(int i=0;i<prices.length;i++){
            maxProfit=Math.max(maxProfit,sp[i]-bp[i]);
        }
        return maxProfit;
    }
}