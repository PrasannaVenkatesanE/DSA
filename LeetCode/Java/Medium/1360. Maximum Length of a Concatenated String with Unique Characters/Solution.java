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
                Map<Character,Integer> map = new HashMap<>();
                String str = arr.get(i)+arr.get(j);
                //System.out.println(str);
                int flag = 1;
                for(int k=0;k<str.length();k++){
                    map.put(str.charAt(k),map.getOrDefault(str.charAt(k),0)+1);
                }
                for(int z=0;z<str.length();z++){
                    if(map.get(str.charAt(z)) > 1){
                        System.out.println(str);
                        flag = 0;
                        break;
                    }
                }
                if(flag == 1 && str.length() > max){
                    max = str.length();
                }
            }
        }
        return max;
    }
}