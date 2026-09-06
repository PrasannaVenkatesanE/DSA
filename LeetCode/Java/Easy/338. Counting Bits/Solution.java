class Solution {
    public int[] countBits(int n) {
        int[] res = new int[n+1];
        res[0] = 0;
        res[1] = 1;
        res[2] = 1;
        for(int i=3;i<=n;i++){
            int count = 0;
            int val = i;
            while(val > 2){
                int rem = val%2;
                if(rem == 1){
                    count+=1;
                }
                val/=2;
            }
            res[i] = count+1;
        }
        return res;
    }
}