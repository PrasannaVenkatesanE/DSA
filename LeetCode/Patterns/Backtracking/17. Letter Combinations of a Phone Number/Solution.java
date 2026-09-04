class Solution {
    public List<String> letterCombinations(String digits) {
        ArrayList<String> res = new ArrayList<>();
        String[][] arr = {{"2","abc"},{"3","def"},{"4","ghi"},{"5","jkl"},{"6","mno"},{"7","pqrs"},{"8","tuv"},{"9","wxyz"}};
        Map<String,String> map = new HashMap<>();
        for(int i=0;i<arr.length;i++){
            map.put(arr[i][0],arr[i][1]);
        }
        
        if (digits.length() != 0){
            backTrack(0,"",digits, res,map);

        }
        return res;
    }
    static void backTrack(int i,String curStr,String digits, List<String> res,Map<String,String> map){
            if(curStr.length() == digits.length()){
                res.add(curStr);
                return;
            }
            String value = String.valueOf(digits.charAt(i));
            for(char c : map.get(value).toCharArray()){
                backTrack(i+1, curStr+c, digits , res,map);
            }
        }
}