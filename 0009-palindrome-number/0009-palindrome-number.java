class Solution {
    public boolean isPalindrome(int x) {
        // if(x<0){
        //     return false;
        // }
        //  StringBuilder sb=new StringBuilder(Integer.toString(x));
        //  String temp=sb.toString();
        //  sb.reverse();
        //  return sb.toString().equals(temp);

        if(x<0){
            return false;
        }
        int temp=x;
        int rev=0;
        while(temp!=0){
            int d=temp%10;
            rev=rev*10+d;
            temp/=10;
        }
        return x==rev;
    }
}