class Solution {
    public void moveZeroes(int[] nums) {
     int left=0;
     int right=0;
    //  while(right<nums.length&&left<=right){
    //     if(nums[left]!=0){
    //         left++;
    //         if(right<left){
    //             right=left;
    //         }
    //     }
    //     if(right<nums.length && nums[right]==0){
    //         right++;
    //     }
    //     else if(right<nums.length && left<nums.length&&left<right && nums[left]==0 && nums[right]!=0){
    //         nums[left]=nums[right];
    //         nums[right]=0;
    //         left++;
    //         right++;
    //     }
    //  }   
    while(left<=right && right<nums.length){
        if(nums[left]!=0){
            left++;
        }
        else if(nums[right]!=0){
            nums[left]^=nums[right];
            nums[right]^=nums[left];
            nums[left]^=nums[right];
            left++;
        }
        right++;
    }
    }
}