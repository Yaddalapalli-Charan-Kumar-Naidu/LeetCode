class Solution {
    public boolean checkValidString(String s) {
        int startRange=0;
        int endRange=0;
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            if(c=='('){
                startRange++;
                endRange++;
            }
            else if(c==')'){
                startRange=Math.max(0,startRange-1);
                endRange--;
            }
            else{
                startRange=Math.max(0,startRange-1);
                endRange++;
            }
            if(endRange<0){
                return false;
            }
        }
        return startRange==0;
    }
}