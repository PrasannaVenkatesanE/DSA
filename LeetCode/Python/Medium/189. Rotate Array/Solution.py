class Solution:
    def rotate(self, nums: list[int], k: int) -> None:
        """
        Do not return anything, modify nums in-place instead.

        """
        
        n = len(nums)
        
        def reverse(s,e):
            while(e > s):
                temp = nums[s]
                nums[s] = nums[e]
                nums[e] = temp
                s+=1
                e-=1


            
        