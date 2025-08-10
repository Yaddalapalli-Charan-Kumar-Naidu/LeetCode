class Solution {
    public int lengthOfLongestSubstring(String s) {
        if(s.length()==0){
            return 0;
        }
        int maxLen=Integer.MIN_VALUE;
        for(int i=0;i<s.length();i++){
            int localMax=0;
            HashSet<Character> set=new HashSet<>();
            int j=i;
            while(j<s.length() && !set.contains(s.charAt(j))){
                set.add(s.charAt(j));
                j++;
                localMax++;
            }
            maxLen=Math.max(maxLen,localMax);
        }        
        return maxLen;
    }
}