package LeetCode;

/**
 * 给你一个 n 阶的楼梯，每次你可以爬 1 阶或 2 阶，你要求出爬完这个楼梯有多少种不同的方法。
 *
 * 比如说，楼梯只有 1 阶，显然你只有一种爬法，就是爬 1 阶，然后到顶。
 *
 * 再比如说，楼梯有 2 阶，那么你可以用两次 1 阶爬到顶，也可以用一次 2 阶爬到顶。共 2 种爬法。
 * @author Bmo
 * @date 2019/11/17 12:44
 */
public class ClimbStairs {

    public int climbstairsRecursive(int n) {
        if (n < 2) return 1;
        return climbstairsRecursive(n-1) + climbstairsRecursive(n-2);
    }
    public int climbstairsIterative(int n) {
        int first = 1, second = 1;
        for (int i = 1; i < n; ++i) {
            int third = first + second;
            first = second;
            second = third;
        }
        return second;
    }
    public static void main(String[] args) {

    }
}
