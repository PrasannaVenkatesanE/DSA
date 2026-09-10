class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        for(int i=0;i<matrix.length;i++){
            int low = 0;
            int high = matrix[i].length - 1;
            
            while(low <= high){
                int middle = (low + high) / 2;
                if(matrix[i][middle] == target){
                    return true;
                }
                if(target > matrix[i][middle]){
                    low = middle+1;
                }
                else{
                    high = middle-1;
                }
            }
        }
        return false;
    }
    
}