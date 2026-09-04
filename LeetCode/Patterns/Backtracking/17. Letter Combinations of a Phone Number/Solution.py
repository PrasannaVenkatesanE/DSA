class Solution:
    def letterCombinations(self, digits: str) -> list[str]:
        res = []
        
        # 1. Equivalent to your String[][] arr setup
        arr = [["2","abc"],["3","def"],["4","ghi"],["5","jkl"],["6","mno"],["7","pqrs"],["8","tuv"],["9","wxyz"]]
        
        # 2. Build the dictionary (equivalent to Map<String, String>)
        mapping = {}
        for pair in arr:
            mapping[pair[0]] = pair[1]
            
        # 3. Defining the backtracking helper function
        def backTrack(i, curStr):
            # Base case: if current string length matches digits length
            if len(curStr) == len(digits):
                res.append(curStr)
                return
            
            # Look up the digit (Python handles characters as strings, so no conversion error)
            digit_key = digits[i]
            
            # Loop through characters in the mapped string
            for c in mapping[digit_key]:
                backTrack(i + 1, curStr + c)
                
        # 4. Run only if digits is not empty
        if len(digits) != 0:
            backTrack(0, "")
            
        return res
