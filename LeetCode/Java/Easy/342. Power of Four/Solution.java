class Solution {
    public boolean isPowerOfFour(int n) {
        if(n == 1){
            return true;
        }
        int res = 1;
        while(res < n){
            res *= 4;
            if(res ==  n){
                return true;
            }
        }
        return false;
    }
}