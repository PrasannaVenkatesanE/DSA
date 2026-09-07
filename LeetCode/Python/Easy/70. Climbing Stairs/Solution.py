class Solution:
    def climbStairs(self, n: int) -> int:
        first = 1
        second = 2
        next = second
        if(n == 1):
            return 1
        while(n-2 > 0):
            next = first + second
            first = second
            second = next
            n -= 1
        return next