class Solution {
    public boolean isPowerOfFour(int n) {
        if(n == 1){
            return true;
        }

        while(n > 1){
            if(n%4 != 0){
                return false;
            }
            n/=4;
        }
        return true;
    }
}