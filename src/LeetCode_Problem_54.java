import java.util.*;

public class LeetCode_Problem_54 {

    public static void main(String[] args) {
        int [] [] arr = {{1,2,3}
                            ,{4,5,6},
                            {7,8,9}};
        System.out.println(spiralOrder(arr));
    }

    public static List<Integer> spiralOrder(int[][] arr) {

        ArrayList<Integer> list  =new ArrayList<>();
        int startRow= 0;
        int startCol = 0;
        int endRow = arr.length-1;
        int endCol = arr[0].length-1;

        while (startRow<=endRow && startCol<=endCol){
            for (int col = startCol; col <=endCol; col++) {
                list.add(arr[startRow][col]);
            }

            for (int row = startRow+1; row <= endRow; row++) {
                list.add(arr[row][endCol]);
            }
            for (int col = endCol-1;col>=startCol;col--){
                if (startRow == endRow) {
                    break;
                }
                list.add(arr[endRow][col]);
            }
            for (int row = endRow-1; row >= startRow+1; row--) {
                if (startCol == endCol) {
                    break;
                }
                list.add(arr[row][startCol]);
            }

            startCol++;
            startRow++;
            endCol--;
            endRow--;

        }
        return list;
    }
}
