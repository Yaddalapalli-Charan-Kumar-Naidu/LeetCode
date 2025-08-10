class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        Stack<Integer> stack=new Stack<>();
        int[] nge=new int[nums2.length];
        for(int i=nums2.length-1;i>=0;i--){
            while(!stack.isEmpty() && stack.peek()<nums2[i]){
                stack.pop();
            }
            nge[i]=stack.isEmpty()?-1:stack.peek();
            stack.push(nums2[i]);
        }
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<nums2.length;i++){
            map.put(nums2[i],nge[i]);
        }
        int[] res=new int[nums1.length];
        for(int i=0;i<nums1.length;i++){
            res[i]=map.get(nums1[i]);
        }
        return res;
    }
}