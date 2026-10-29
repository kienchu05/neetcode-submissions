class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int m = matrix.length;
        int n = matrix[0].length;

        int l = 0;
        int r = n - 1;

        while(l <  m &&  r >= 0){
            int x = matrix[l][r];
            if(x == target) return true;
            if(x < target){
                l++;
            }else r--;
        }
        return false;
    }
}
