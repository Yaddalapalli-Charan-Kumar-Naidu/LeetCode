class Solution {
    
    public void normalSwap(int[][] matrix,int i,int j){
        matrix[i][j]^=matrix[j][i];
        matrix[j][i]^=matrix[i][j];
        matrix[i][j]^=matrix[j][i];

    }
    public void rotate(int[][] matrix) {
        // int[][] temp=new int[matrix.length][matrix[0].length];
        // for(int i=0;i<matrix.length;i++){
        //     for(int j=0;j<matrix[0].length;j++){
        //         temp[j][matrix[0].length-1-i]=matrix[i][j];
        //     }
        // }
        // for(int i=0;i<matrix.length;i++){
        //     for(int j=0;j<matrix[0].length;j++){
        //         matrix[i][j]=temp[i][j];
        //     }
        // }
        for(int i=0;i<matrix.length;i++){
            for(int j=i+1;j<matrix[0].length;j++){
                normalSwap(matrix,i,j);
            }
        }
        for(int i=0;i<matrix.length;i++){
            int left = 0, right = matrix.length- 1;
            while (left < right) {
                int temp = matrix[i][left];
                matrix[i][left] = matrix[i][right];
                matrix[i][right] = temp;
                left++;
                right--;
            }
        }
    }
}