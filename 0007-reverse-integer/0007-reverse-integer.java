class Solution {
    public int reverse(int x) {
        boolean neg=false;
        if(x<0){
            neg=true;
            x=-x;
        }
        StringBuilder str=new StringBuilder(Integer.toString(x));
        str.reverse();
        try{
            int val=Integer.parseInt(str.toString());
           return neg==true? -val: val;
        }
        catch(Exception e){
            return 0;
        }
    }
}