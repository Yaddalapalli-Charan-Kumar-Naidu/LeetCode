class Solution {
    public void reverse(int[] nums,int left,int right){
        while(left<right){
            nums[left]^=nums[right];
            nums[right]^=nums[left];
            nums[left]^=nums[right];
            left++;
            right--;
        }
    }
    public void rotate(int[] nums, int k) {
        // int n=nums.length;
        // k=k%n;
        // int[] temp=new int[n-k];
        // for(int i=0;i<n-k;i++){
        //     temp[i]=nums[i];
        // }
        // for(int i=0;i<k;i++){
        //     nums[i]=nums[n-k+i];
        // }
        // for(int i=k;i<n;i++){
        //     nums[i]=temp[i-k];
        // }
        // optimized
        int n=nums.length;
        if(n==1){
            return;
        }
        k=k%n;
        reverse(nums,0,n-k-1);
        reverse(nums,n-k,n-1);
        reverse(nums,0,n-1);
    }
}