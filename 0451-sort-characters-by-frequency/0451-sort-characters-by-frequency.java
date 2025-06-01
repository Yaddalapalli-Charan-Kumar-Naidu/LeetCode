class Solution {
    public String frequencySort(String s) {
        int maxFreq=0;
        LinkedHashMap<Character,Integer> map=new LinkedHashMap<>();
        for(int i=0;i<s.length();i++){
            map.put(s.charAt(i),map.getOrDefault(s.charAt(i),0)+1);
            maxFreq=Math.max(map.get(s.charAt(i)),maxFreq);
        }
        // Collections.sort(map);

        StringBuilder str=new StringBuilder();
        for(int i=maxFreq;i>0;i--){
            for(Character c:map.keySet()){
            if(map.get(c)==i)
            str.append(String.valueOf(c).repeat(i));
        }
        }
        
        return str.toString();
    }   
}