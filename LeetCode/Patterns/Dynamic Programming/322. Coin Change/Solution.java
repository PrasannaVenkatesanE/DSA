class Solution {
    public int coinChange(int[] coins, int amount) {
        int res = 0;
        int index = coins.length-1;
        int count = 0;
        while(true){
            res += coins[index];
            count++;

            if(res > amount){
                res -= coins[index];
                index--;
                count--;
            }

            if(res == amount){
                return count;
            }
            
            if(index < 0){
                return -1;
            }
        }
    }
}