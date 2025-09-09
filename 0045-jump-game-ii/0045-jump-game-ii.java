class Solution {
    public int jump(int[] nums) {
        // int jumps=0,end=0,farthest=0;
        // for(int i=0;i<nums.length-1;i++){
        //     farthest=Math.max(farthest,i+nums[i]);
        //     if(i==end){
        //         jumps++;
        //         end=farthest;
        //     }
        // }
        // return jumps;

        int left=0,right=0;
        int jumps=0;
        while(right<nums.length-1){
                    int farthest=0;
            for(int i=left;i<=right;i++){
                farthest=Math.max(i+nums[i],farthest);
            }
            left=right+1;
            right=farthest;
            jumps++;
        }
        return jumps;
    }
}