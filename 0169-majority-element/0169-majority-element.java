class Solution {
    public int majorityElement(int[] nums) {
        // if (nums.length == 1) {
        //     return nums[0];
        // }
        // for (int i = 0; i < nums.length; i++) {
        //     int count = 1;
        //     for (int j = 0; j < nums.length; j++) {
        //         if (i != j && nums[i] == nums[j]) {
        //             count++;
        //             if (count >= (int) Math.ceil(nums.length / 2.0)) {
        //                 System.out.println(Math.ceil(nums.length / 2));
        //                 return nums[i];
        //             }
        //         }
        //     }
        // }
        // return -1;
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }
        int max=0;
        for(int key:map.keySet()){
            if(map.get(key)>nums.length/2){
                return key;
            }
        }
        return -1;
    }
}