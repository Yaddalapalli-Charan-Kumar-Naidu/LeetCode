class Solution {
    public int reverse(int x) {
        // boolean neg=false;
        // if(x<0){
        //     neg=true;
        //     x=-x;
        // }
        // StringBuilder str=new StringBuilder(Integer.toString(x));
        // str.reverse();
        // try{
        //     int val=Integer.parseInt(str.toString());
        //    return neg==true? -val: val;
        // }
        // catch(Exception e){
        //     return 0;
        // }

        int res=0;
        int temp=x;
        while(temp!=0){
            int d=temp%10;
            if(res>Integer.MAX_VALUE/10 || res<Integer.MIN_VALUE/10){
                return 0;
            }
            // if((res==Integer.MAX_VALUE/10 && d>7) ||(res==Integer.MIN_VALUE/10 && d<-8)){
            //     return 0;
            // }
                        res=res*10+d;

            temp=temp/10;
        }
        return res;
    }
}