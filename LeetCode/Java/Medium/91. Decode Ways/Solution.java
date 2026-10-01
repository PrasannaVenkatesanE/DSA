class Solution {
    public int numDecodings(String s) {
       int n  = s.length();
       int[] dp = new int[n+1];

       dp[0] = 1;

       for(int i=1;i<=n;i++){
            if(s.charAt(i-1) != '0'){
                dp[i] += dp[i-1];
            }

            if(i >= 2){
                int num = Integer.parseInt(s.substring(i-2,i));
                if(num>=10 && num<=26){
                    dp[i] += dp[i-2];
                }
            }
       }
        return dp[n];
    }
}