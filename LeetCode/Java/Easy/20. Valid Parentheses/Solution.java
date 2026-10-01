class Solution {
    public boolean isValid(String s) {
        HashMap<Character,Character> map = new HashMap<>();
        map.put(')','(');
        map.put('}','{');
        map.put(']','[');
        ArrayList<Character> arr = new ArrayList<>();
        for(char i:s.toCharArray()){
            if(map.containsKey(i)){
                if (arr.size()!=0 && arr.get(arr.size()-1)==map.get(i))
                    arr.remove(arr.size()-1);
                else
                    return false;    
            }
            else{
                arr.add(i);
            }
        }
        return arr.isEmpty();
    }
}