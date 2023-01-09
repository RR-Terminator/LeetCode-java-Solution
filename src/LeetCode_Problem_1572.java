public class LeetCode_Problem_1572 {
    public static void main(String[] args) {
        int [][] arr = {{1,2,3}
                ,{4,5,6}
                ,{7,8,9}};
        System.out.println(diagonalSumBetter(arr));
    }

    // Time Complexity  O(n^2)
    public static int diagonalSum(int[][] mat) {
        int sum = 0;
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[0].length; j++) {
                if (i == j) {
                    sum+=mat[i][j];
                }
                else if (j+i == mat.length-1) {
                    sum+=mat[i][j];
                }
            }
        }
        return sum;
    }

    public static int diagonalSumBetter(int[][] mat) {
        int sum = 0;
        for (int i = 0; i < mat.length; i++) {


            // Finding the sum of primary diagonal element as the  index of row and
            // Columns are Equal in the  at  the primary one for e.g. 3X3 matrix
            // Primary Diagonal elements ar [0,0] [1,1] [2,2]

            // To Find the sum of the Secondary Diagonal element the sum of the row
            // and columns are equal to the matrix.length -1 i.e. i+j = mat.length-1
            // Here to find the value of the matrix Column you can do
            // column =  mat.length-row-1 i.e j = mat.length-i-1
            // to tackle overlapping Conditions in the odd matrix you can have
            // condition int the secondary diagonal  where row!=col as we had already
            // Calculated in the Primary diagonal.
            sum+= mat[i][i];
            if (i != mat.length-i-1) {
                sum+=mat[i][mat.length-i-1];
            }
        }
        return sum;
    }
}
