class Solution {
    public int maxPalindromes(String s, int k) {
        int count = 0;
        Map<String,Integer> map = new HashMap<>();
        for(int i=0;i<s.length();i++){
            for(int j=i;j<s.length()+1;j++){
                String str = s.substring(i,j);
                if(str.length()>=k && isPalindrome(str)){
                    i = j+;
                    System.out.println(str);
                    count++;
                    
                }
            }
        }
        return count;
    }
    boolean isPalindrome(String str){
        int left = 0;
        int right = str.length()-1;

        while(left< right){
            if(str.charAt(left) != str.charAt(right)){
                return false;
            }
            left++;right--;
        }
        return true;
    }
}