class Solution {
    public void setZeroes(int[][] matrix) {
        ArrayList<Integer> rows=new ArrayList<>();
        ArrayList<Integer> cols=new ArrayList<>();

        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                if(matrix[i][j]==0){
                    rows.add(i);
                    cols.add(j);
                }
            }
        }
        for(int i=0;i<rows.size();i++){
            for(int j=0;j<matrix[0].length;j++){
                matrix[rows.get(i)][j]=0;
            }
        }
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<cols.size();j++){
                matrix[i][cols.get(j)]=0;
            }
        }
    }
}