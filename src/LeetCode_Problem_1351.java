public class LeetCode_Problem_1351 {

    public static void main(String[] args) {
        //int [][] grid = {{4,3,2,-1},{3,2,1,-1},{1,1,-1,-2},{-1,-1,-2,-3}};
       int [][] grid = {{5,1,0},{-5,-5,-5}};
        System.out.println(countNegatives(grid));
    }
    public static int countNegatives(int[][] grid) {
        int row_len = grid[0].length;
        int col_len = grid.length;
        int i = 0;
        int count = 0;
        int j = row_len-1;
        while (i<col_len && j>=0){
            if (grid[i][j] < 0) {

                count +=col_len-i;
                j-=1;

            }

            else {
                i+=1;
            }
        }


        return count;

    }
}
