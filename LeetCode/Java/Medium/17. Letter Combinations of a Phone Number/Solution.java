import java.util.*;

class Solution {
    public List<String> letterCombinations(String digits) {
        List<String> res = new ArrayList<>();
        
        // Edge case: if input is empty, return empty list immediately
        if (digits == null || digits.length() == 0) {
            return res;
        }

        // Map setup
        String[][] arr = {{"2","abc"},{"3","def"},{"4","ghi"},{"5","jkl"},{"6","mno"},{"7","pqrs"},{"8","tuv"},{"9","wxyz"}};
        Map<Character, String> map = new HashMap<>(); // Changed key to Character for easier lookups
        for (int i = 0; i < arr.length; i++) {
            map.put(arr[i][0].charAt(0), arr[i][1]);
        }

        // Start backtracking
        backTrack(0, "", digits, res, map);
        return res;
    }    

    // The backtracking method must be declared outside, at the class level
    private void backTrack(int i, String curStr, String digits, List<String> res, Map<Character, String> map) {
        // Base case: if current string length matches digits length, we found a combination
        if (curStr.length() == digits.length()) {
            res.add(curStr);
            return;
        }
        
        // Get the letters corresponding to the current digit
        char currentDigit = digits.charAt(i);
        String letters = map.get(currentDigit);
        
        // Loop through the letters and recurse
        for (char c : letters.toCharArray()) {
            backTrack(i + 1, curStr + c, digits, res, map);
        }
    }
}
