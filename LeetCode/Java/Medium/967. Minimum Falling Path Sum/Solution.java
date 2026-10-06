class Solution {
    public int minFallingPathSum(int[][] matrix) {
        int n = matrix.length;

        int[][] dp = new int[n][n];

        for(int j=0;j<n;j++){
            dp[0][j] = matrix[0][j];
        }

        for(int i=1;i<n;i++){
            for(int j=0;j<n;j++){
                
                int u = dp[i-1][j];

                int left = Integer.MAX_VALUE;
                if(j > 0){
                    left = dp[i-1][j-1];
                }

                int right = Integer.MAX_VALUE;
                if(j<n-1){
                    right = dp[i-1][j+1];
                }

                dp[i][j] = matrix[i][j] + Math.min(u,Math.min(left,right));
            }
        }

        int ans = Integer.MAX_VALUE;

        for(int j=0;j<n;j++){
            ans = Math.min(ans,dp[n-1][j]);
        }

        return ans;
    }   
}