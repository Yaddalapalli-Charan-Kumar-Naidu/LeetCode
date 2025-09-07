class Solution {
    public int maxFrequency(int[] nums, int k) {
        // int maxLen=0;
        // Arrays.sort(nums);
        // for(int i=nums.length-1;i>=0;i--){
        //     int len=1;
        //     int temp=k;
        //     for(int j=i-1;j>=0;j--){
        //         if(nums[i]-nums[j]<=temp){
        //             temp-=(nums[i]-nums[j]);
        //             len++;
        //         }
        //     }
        //     maxLen=Math.max(len,maxLen);
        // }
        // return maxLen;
        

        int maxLen=0;
        int left=0;
        int right=0;
        long total=0;
        Arrays.sort(nums);
        while(right<nums.length){
            total+=nums[right];
            while((long)nums[right]*(right-left+1)>total+k){
                total-=nums[left];
                left++;
            }
            maxLen=Math.max(maxLen,right-left+1);
            right++;

        }
        return maxLen;
    }
}