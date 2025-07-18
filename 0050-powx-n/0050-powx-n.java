class Solution {
    public double myPow(double x, int n) {
        double ans=1;
        
        long m=n;
        if(m<0){
            m=-m; //need to store like only after converting to long if we convert positive to negative before storing it will overflow of integer and edge cases will fail
        }
        while(m>0){
            if(m%2==0){
                x=x*x;
                m=m/2;
            }
            else{
                m=m-1;
                ans*=x;
            }
        }
        if(n<0){
            return 1.0/ans;
        }
        return ans;
    }
}