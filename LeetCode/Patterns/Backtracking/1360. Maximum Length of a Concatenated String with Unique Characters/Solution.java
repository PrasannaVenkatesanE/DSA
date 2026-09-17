class Solution {
    public int maxLength(List<String> arr) {
        if(arr.size() == 1){
            return arr.get(0).length();
        }
        int max = 0;

        for(int i=0;i<arr.size();i++){
            for(int j=0;j<arr.size();j++){
                if(i==j){
                    continue;
                }
                String str = arr.get(i)+arr.get(j);
                if(str.length() > max){
                    max = str.length();
                }
            }
        }
        return max;
    }
}