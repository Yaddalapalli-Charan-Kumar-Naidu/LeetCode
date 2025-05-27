class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> list=new ArrayList<>();
        for(int i=0;i<numRows;i++){
            List<Integer> subList=new ArrayList<>();
            for(int j=0;j<=i;j++){
                if(i==0 || j==0 || i==j){
                    subList.add(1);
                }
                else{
                    subList.add(list.get(i-1).get(j-1)+list.get(i-1).get(j));
                }
            }
            list.add(subList);
        }
        return list;
    }
}