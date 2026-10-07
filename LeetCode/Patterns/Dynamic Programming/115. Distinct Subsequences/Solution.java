class Solution {
    public int numDistinct(String s, String t) {
        int l1 = s.length();
        int l2 = t.length();

        int[][] dp = new int[l2+1][l1+1];

        for(int col=0;col<=l1;col++){
            dp[0][col] = 1;
        }

        for(int i=1;i<=l2;i++){
            for(int j=1;j<=l1;j++){
                if(s.charAt(j-1) == t.charAt(i-1)){
                    dp[i][j] = dp[i-1][j-1] + dp[i][j-1];
                }
                else{
                    dp[i][j] = dp[i][j-1];
                }
            }
        }

        return dp[l2][l1];
    }
}