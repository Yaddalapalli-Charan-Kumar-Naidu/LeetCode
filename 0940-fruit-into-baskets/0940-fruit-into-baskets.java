class Solution {
    public int totalFruit(int[] fruits) {
        // int maxLen=0;
        // for(int i=0;i<fruits.length;i++){
        // HashSet<Integer> set=new HashSet<>();

        //     for(int j=i;j<fruits.length;j++){
        //         set.add(fruits[j]);
        //         if(set.size()>2){
        //             break;
        //         }
        //             maxLen=Math.max(j-i+1,maxLen);
        //     }
        // }
        // return maxLen;

        // int left=0;
        // int right=0;
        // int maxLen=0;
        // HashMap<Integer,Integer> map=new HashMap<>();
        // while(right<fruits.length){
        //     map.put(fruits[right],map.getOrDefault(fruits[right],0)+1);
        //     while(map.size()>2 && left<=right){
        //             map.put(fruits[left],map.get(fruits[left])-1);

        //             if(map.get(fruits[left])==0){
        //                 map.remove(fruits[left]);
        //             }

        //         left++;
        //     }
        //     maxLen=Math.max(maxLen,right-left+1);
        //     right++;
        //     System.out.println("Map:"+map);
        // }
        // return maxLen;

        int left = 0;
        int right = 0;
        int maxLen = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        while (right < fruits.length) {
            map.put(fruits[right], map.getOrDefault(fruits[right], 0) + 1);
            if (map.size() > 2) {
                map.put(fruits[left], map.get(fruits[left]) - 1);
                if (map.get(fruits[left]) == 0) {
                    map.remove(fruits[left]);
                }
                left++;

            }
            right++;
            maxLen = Math.max(maxLen, right - left );
        }
        return maxLen;
    }
}