class Solution {
    public int maxProfit(int[] prices) {
        // int sp[]=new int[prices.length];
        // int bp[]=new int[prices.length];
        // sp[prices.length-1]=prices[prices.length-1];
        // bp[0]=prices[0];
        // for(int i=0;i<prices.length;i++){
        //     if(i==0){
        //         continue;
        //     }
        //     else{
        //          bp[i]=Math.min(prices[i],bp[i-1]);
        //     }
        //     if(i==prices.length-1){
        //         continue;
        //     }
        //     else{
        //         sp[prices.length-i-1]=Math.max(prices[prices.length-i-1],sp[i+1]);
        //     }           
        
        // int maxReturn=0;
        // for(int i=0;i<prices.length;i++){
        //     if(sp[i]>bp[i]){
        //         maxReturn=Math.max(maxReturn,sp[i]-bp[i]);
        //     }
        // }
        // return maxReturn;
        
        int bp=prices[0];
        int maxReturn=0;
        for(int i=1;i<prices.length;i++){
            maxReturn=Math.max(prices[i]-bp,maxReturn);
            bp=Math.min(prices[i],bp);
        }
        return maxReturn;
    }
}