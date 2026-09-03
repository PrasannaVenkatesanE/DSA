class Solution:
    def rotate(self, nums: list[int], k: int) -> None:
        """
        Do not return anything, modify nums in-place instead.

        """
        
        n = len(nums)
        k = k % n

        for i in range(k):

            last_num = nums[n-1]
            
            for j in range(n-1,0,-1):
                
                nums[j] = nums[j-1]
            nums[0] = last_num
            
        