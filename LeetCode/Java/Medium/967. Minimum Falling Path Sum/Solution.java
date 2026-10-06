class Solution {
    public int minFallingPathSum(int[][] matrix) {
        int row = matrix.length;
        int col = matrix[0].length;

        int min = Integer.MAX_VALUE;

        for(int j=0;j<col;j++){
            min = Math.min(min, helper(matrix,row-1,j));
        }

        return min;
    }

    static int helper(int[][] mat, int i , int j){
        
        if(j<0 || j>=mat[0].length){
            return 10000;
        }
        if(i==0){
            return mat[0][j];
        }

        int u = mat[i][j] + helper(mat,i-1,j);
        int ld = mat[i][j] +  helper(mat,i-1,j-1);
        int rd = mat[i][j] + helper(mat,i-1,j+1);

        return Math.min(u, Math.min(ld,rd));
    }
}