class Solution {
    public int[] rearrangeArray(int[] nums) {
        int left=0;
        int right=0;
        int res[]=new int[nums.length];
        int k=0;
        while(right<nums.length){
            while(left<nums.length && nums[left]<0){
                left++;
            }
            if(k%2==0){
                res[k]=nums[left];
                left++;
            }
            else{
                res[k]=nums[right];
                right++;
            }
            while(right<nums.length && nums[right]>0){
                right++;
            }
            k++;
        }
        return res;
    }
}