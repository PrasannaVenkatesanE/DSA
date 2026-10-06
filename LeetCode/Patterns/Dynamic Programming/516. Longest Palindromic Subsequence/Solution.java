class Solution {
    public int longestPalindromeSubseq(String s) {
        String rev = new StringBuilder(s).reverse().toString();

        int l1 = s.length();
        int l2 = rev.length();

        int[][] dp = new int[l1+1][l2+1];

        for(int i=1;i<=l1;i++){
            for(int j=1;j<=l2;j++){

                if(s.charAt(i-1) == rev.charAt(j-1)){
                    dp[i][j] = dp[i-1][j-1] + 1;
                }

                else{
                    dp[i][j] = Math.max(dp[i-1][j], dp[i][j-1]);
                }
            }
        }

        return dp[l1][l2];
    }
}