class Solution {
    public int kthSmallest(int[][] matrix, int k) {
        int rows = matrix.length;
        int cols = matrix[0].length;
        int left = 0;
        int right = rows*cols - 1;

        while(left <= right){
            int mid = (left + right) / 2;
            int row = mid/cols;
            int col = mid%cols;

            if((row*rows) + col == k-1){
                System.out.println(row+" "+col);
                return matrix[row][col];
            }
            else if((row*rows) + col < k){
                left = mid + 1;
            }
            else{
                right = mid - 1;
            }
        }
        return 0;
    }
}