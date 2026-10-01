class Solution {
    public int lengthOfLIS(int[] nums) {
        int[][] dp = new int[nums.length][nums.length+1];

        for(int[] arr : dp){
            Arrays.fill(arr,-1);
        }
        return memo(0,-1,dp,nums);

    }

    static int memo(int i, int prev , int[][] dp, int[] nums){
        if(i == nums.length) return 0;

        if(dp[i][prev+1] != -1) return dp[i][prev+1];

        int nt = memo(i+1,prev,dp,nums);
        int take = 0;

        if(prev == -1 || nums[i]>nums[prev]){
            take = 1 + memo(i+1,i,dp,nums);
        }
        
        return dp[i][prev+1] = Math.max(take,nt);
    }
}