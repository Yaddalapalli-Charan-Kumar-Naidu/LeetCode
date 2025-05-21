class Solution {
    public int missingNumber(int[] nums) {
        int max=nums[0];
        int sum=0;
        boolean hasZero=false;
        for(int i=0;i<nums.length;i++){
            if(nums[i]>max){
                max=nums[i];
            }
            sum+=nums[i];
            if(nums[i]==0){
                hasZero=true;
            }
        }
        if(!hasZero){
            return 0;
        }
        else if(sum-(max*(max+1))/2==0){
            return max+1;
        }
        return (max*(max+1))/2-sum;
    }
}