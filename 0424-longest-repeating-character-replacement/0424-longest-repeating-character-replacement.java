class Solution {
    public int characterReplacement(String s, int k) {
        HashMap<Character,Integer> map=new HashMap<>();
        int left=0;
        int right=0;
        int maxLen=0;
        int maxFreq=0;
        int freq[]=new int[26];
        while(right<s.length()){
            freq[s.charAt(right)-'A']++;
            maxFreq=Math.max(maxFreq,freq[s.charAt(right)-'A']);
            if(right-left+1-maxFreq>k){
                freq[s.charAt(left)-'A']--;
                // for(int i=0;i<26;i++){
                //     maxFreq=Math.max(maxFreq,freq[i]);
                // }
                left++;

            }
            right++;
            maxLen=Math.max(maxLen,right-left);
        }
        return maxLen;
    }
}