class Solution {
    public int diagonalSum(int[][] mat) {
        int rows = mat.length;
        int columns = mat[0].length;
        int sum = 0;
        for(int row = 0; row < rows; row ++){
            int primaryDiagonal = mat[row][row];
            int secondaryDiagonal = mat[row][columns - 1 - row];
            sum += primaryDiagonal;
            if(row != (columns - 1 - row)){
                sum += secondaryDiagonal;
            }
        }
        return sum;
    }
}