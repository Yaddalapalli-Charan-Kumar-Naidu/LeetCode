class Solution {
    public List<String> buildArray(int[] target, int n) {
        ArrayList<String> list=new ArrayList<>();
        int i=0,j=1;
        while(i<target.length && j<=target[target.length-1]){
            if(target[i]==j){
                list.add("Push");
                            i++;

            }
            else{
                list.add("Push");
                list.add("Pop");
            }
            j++;
        }
        return list;
    }
}