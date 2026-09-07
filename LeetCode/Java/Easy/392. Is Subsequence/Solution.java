class Solution {
    public boolean isSubsequence(String s, String t) {
        if(s.isEmpty()){
            return true;
        }

        int s_index = 0;
        int t_index = 0;

        while(s_index < s.length() && t_index < t.length()){
            if(s.charAt(s_index) == t.charAt(t_index)){
                s_index++;
            }
            t_index++;
            if(s_index == s.length()){
                return true;
            }
        }

        return false;
    }
}