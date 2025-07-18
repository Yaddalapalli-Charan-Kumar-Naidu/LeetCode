class Solution {
    public int myAtoi(String s) {
        s=s.trim();
        boolean neg=false;
        int i=0;
        if(s.length()==0){
            return 0;
        }
        if(s.charAt(0)=='-'){
            i=1;
            neg=true;
        }
        else if(s.charAt(0)=='+'){
            i=1;
        }
        long res=0;
        while(i<s.length()){
            if(Character.isDigit(s.charAt(i))){
                res=res*10+(s.charAt(i)-'0');
                if (!neg && res > Integer.MAX_VALUE) return Integer.MAX_VALUE;
            if (neg && -res < Integer.MIN_VALUE) return Integer.MIN_VALUE;
            }
            else{break;}
            i++;
        }

        if(neg){
            if(-res<Integer.MIN_VALUE){
                return Integer.MIN_VALUE;
            }
            return (int)-res;
        }
        if(res>Integer.MAX_VALUE){
            return Integer.MAX_VALUE;
        }
        return (int)res;
    }
}