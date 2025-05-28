class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        // List<List<Integer>> list = new ArrayList<>();
        // int n = nums.length;
        // for (int i = 0; i < n; i++) {
        //     for (int j = i + 1; j < n; j++) {

        //         for (int k = j + 1; k < n; k++) {
        //             List<Integer> subList = new ArrayList<>();

        //             if (nums[i] + nums[j] + nums[k] == 0) {
        //                 subList.add(nums[i]);
        //                 subList.add(nums[j]);
        //                 subList.add(nums[k]);
        //             }
        //             Collections.sort(subList);
        //             if (subList.size() > 0 && !list.contains(subList))
        //                 list.add(subList);

        //         }
        //     }
        // }
        // return list;

        // List<List<Integer>> list = new ArrayList<>();
        // int n = nums.length;
        // TreeSet<Integer> set=new TreeSet<>();
        // for(int i=0;i<n;i++){
        //     for(int j=i+1;j<n;j++){
        //         if(set.contains(-(nums[i]+nums[j]))){
        //             List<Integer> subList = new ArrayList<>();
        //                 subList.add(nums[i]);
        //                 subList.add(nums[j]);
        //                 subList.add(-(nums[i]+nums[j]));
        //                 Collections.sort(subList);
        //                 if(subList.size()>0 && !list.contains(subList))
        // list.add(subList);
        //         }
        //     }
        //     set.add(nums[i]);
            

        // }
        // return list;

        //above two time limit exceeded

        Arrays.sort(nums);
        List<List<Integer>> list = new ArrayList<>();
        int n = nums.length;
        for (int i = 0; i < n; i++) {
            if(i>0 && nums[i]==nums[i-1]){
                continue;
            }
            int j=i+1;
            int k=n-1;
            while(j<k){
                int sum=nums[i]+nums[j]+nums[k];
                if(sum<0){
                    j++;
                }
                else if(sum>0){
                    k--;
                }
                else{
                    List<Integer> subList = new ArrayList<>();
                        subList.add(nums[i]);
                        subList.add(nums[j]);
                        subList.add(nums[k]);
                        k--;
                        j++;
                        list.add(subList);
                        while(j<k && nums[j]==nums[j-1]) j++;
                        while(j<k && nums[k]==nums[k+1]) k--;
                }
            }
        }
        return list;
    }

}