class Solution:
    def beautifulArray(self, n: int) -> List[int]:
        arr = []
        arr.append(1)

        while(len(arr) < n):
            temp = []

            for ele in arr:
                if(ele*2 -1 <= n):
                    temp.append(ele*2 - 1)
            for ele in arr:
                if(ele*2 <= n):
                    temp.append(ele*2)
            arr = temp
        return arr