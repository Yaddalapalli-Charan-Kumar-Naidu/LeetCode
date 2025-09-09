class Solution {
    public boolean canJump(int[] nums) {
        int maxJumpIndex=0;
        for(int i=0;i<nums.length;i++){
            if(maxJumpIndex<i){
                return false;
            }
            maxJumpIndex=Math.max(maxJumpIndex,(i+nums[i]));
        }
        return true;
    }
}