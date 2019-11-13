package LeetCode;

/**
 *
 这个题目说的是，给你一个二维数组 matrix，和一个目标值 target。
 你要在数组里找到这个目标值，然后返回它的行/列下标。如果找不到，则返回 [-1,-1]。
 这个数组的每一行都是从左向右递增，每一列都是从上到下递增。
 * @author Bmo
 * @date 2019/11/12 10:02
 */
public class SearchIn2DArray {
    public int[] searchIn2DArray(int[][] matrix, int target) {
        if (matrix == null || matrix.length == 0 ||
        matrix[0] == null || matrix[0].length == 0)
            return new int[]{-1, -1};
        int m = matrix.length, n = matrix[0].length;
        int i = 0, j = n - 1;
        while (i < m && j >= 0) {
            if (target < matrix[i][j]) --j;
            else if (target > matrix[i][j]) ++i;
            else return new int[]{i, j};
        }
        return new int[]{-1, -1};
    }
}
