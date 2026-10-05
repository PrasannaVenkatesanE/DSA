class Solution:
    def maximalSquare(self, matrix: list[list[str]]) -> int:
        rows = len(matrix)
        cols = len(matrix[0])

        dp = [[0]*cols for _ in range(rows)]
        maxside = 0 
        for i in range(rows):
            for j in range(cols):

                if(matrix[i][j] == '1'):

                    if i == 0 or j == 0:
                        dp[i][j] = 1

                    else:
                        dp[i][j] = 1 + min(dp[i-1][j], dp[i][j-1], dp[i-1][j-1])

                    maxside = max(maxside, dp[i][j])

        return maxside**2