class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        
        int l = 0;
        int h = matrix.length - 1;
        int targetRow = 0;

        while(l<=h){
            int mid = (l + h) / 2;
            if(target >= matrix[mid][0] && target <= matrix[mid][matrix[mid].length-1]){
                targetRow = mid;
                break;
            }
            if(target > matrix[mid][matrix[mid].length-1]){
                l = mid + 1;
            }
            else{
                h = mid - 1;
            }
        }
        int low = 0;
        int high = matrix[targetRow].length - 1;
        while(low <= high){
            int middle = (low + high) / 2;
            if(matrix[targetRow][middle] == target){
                return true;
            }
            if(target > matrix[targetRow][middle]){
                low = middle+1;
            }
            else{
                high = middle-1;
            }
        }
        
        return false;
    }
    
    
}