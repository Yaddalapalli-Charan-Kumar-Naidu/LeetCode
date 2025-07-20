class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int[] res=new int[nums1.length];
        int k=0;
        for(int i=0;i<nums1.length;i++){
            boolean search=false;
            boolean found=false;
            for(int j=0;j<nums2.length;j++){
                if(nums2[j]==nums1[i]){
                    search=true;
                }
                if(search==true && nums2[j]>nums1[i]){
                    res[k]=nums2[j];
                    found=true;
                    break;
                }
            }
            if(found==false){
                res[k]=-1;
            }
            k++;
        }   
        return res;
    }
}