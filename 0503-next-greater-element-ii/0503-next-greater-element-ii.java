class Solution {
    public int[] nextGreaterElements(int[] nums) {
        int[] nge=new int[nums.length];
        Stack<Integer> stack=new Stack<>();
        int idx;
        for(int i=2*nums.length-1;i>=0;i--){
            idx=i%nums.length;
            while(!stack.isEmpty() && stack.peek()<=nums[idx]){
                stack.pop();
            }
            if(i<nums.length)
            nge[idx]=stack.isEmpty()?-1:stack.peek();
            stack.push(nums[idx]);
        }
        return nge;
    }
}