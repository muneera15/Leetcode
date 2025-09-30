class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> res = new ArrayList<>();
        int count = 0;
        int rows = matrix.length;
        int cols = matrix[0].length;
        int up = 0;
        int left = 0;
        int right = cols - 1;
        int down = rows - 1;
        while(count < rows * cols ){
            for(int col = left; col <= right; col ++){
                count ++;
                res.add(matrix[up][col]);
            }
            for(int row = up + 1; row <= down; row ++){
                count ++;
                res.add(matrix[row][right]);
            }
            if(up != down){
                for(int col = right - 1; col >= left; col --){
                    count ++;
                    res.add(matrix[down][col]);
                }
            }
            if(right != left){
                for(int row = down - 1; row > up; row --){
                    count ++;
                    res.add(matrix[row][left]);
                }
            }
            left ++;
            right --;
            down --;
            up ++;
        }
        return res;
    }
}