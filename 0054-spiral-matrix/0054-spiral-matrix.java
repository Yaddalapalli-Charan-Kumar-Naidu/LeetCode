class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> list = new ArrayList<>();
        int frow = 0;
        int lrow = matrix.length - 1;
        int fcol = 0;
        int lcol = matrix[0].length - 1;
        int i;
        while (frow <= lrow && fcol <= lcol) {
            i = fcol;
            while (i <= lcol) {
                list.add(matrix[frow][i]);
                i++;
            }
            frow++;
            i = frow;
            while (i <= lrow) {
                list.add(matrix[i][lcol]);
                i++;
            }
            lcol--;
            if (frow <= lrow) {
                i = lcol;
                while (i >= fcol) {
                    list.add(matrix[lrow][i]);
                    i--;
                }
                lrow--;
            }
            if(fcol<=lcol){
                i = lrow;
                while (i >=frow ) {
                    list.add(matrix[i][fcol]);
                    i--;
                }
                fcol++;

            }
        }

        return list;
    }
}