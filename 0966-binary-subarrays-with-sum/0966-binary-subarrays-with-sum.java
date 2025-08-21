class Solution {
    public int numSubarraysWithSum(int[] nums, int goal) {
        // int count=0;
        // for(int i=0;i<nums.length;i++){
        //     int sum=0;
        //     for(int j=i;j<nums.length;j++){
        //         sum+=nums[j];
        //         if(sum==goal){
        //             count++;
        //         }
        //     }
        // }
        // return count;

        return atMostGoal(nums,goal)-atMostGoal(nums,goal-1);
    }
    public int atMostGoal(int[] nums,int goal){
        if(goal<0) return 0;
        int left=0;
        int right=0;
        int count=0;
        int sum=0;
        while(right<nums.length){
            sum+=nums[right];
            while(sum>goal){
                sum-=nums[left];
                left++;
            }
            count+=(right-left+1);
            right++;
        }
        return count;
    }
}
