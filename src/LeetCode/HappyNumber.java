package LeetCode;

import java.util.HashSet;
import java.util.Set;

/**
 A happy number is a number defined by the following process:
 Starting with any positive integer, replace the number by the sum of the squares of its digits,
 and repeat the process until the number equals 1 (where it will stay),
 or it loops endlessly in a cycle which does not include 1.
 Those numbers for which this process ends in 1 are happy numbers.
 * @author Bmo
 * @date 2020/2/13 22:03
 */
public class HappyNumber {
    private int transform(int n) {
        int sum = 0;
        while (n != 0) {
            int a = n % 10;
            sum += a * a;
            n /= 10;
        }
        return sum;
    }
    // Time: O(1), Space: O(1)
    public boolean isHappyHashSet(int n) {
        if (n <= 0) return false;
        Set<Integer> set = new HashSet<>();
        for (int i = n; i != 1; i = transform(i)) {
            if (set.contains(i)) return false;
            set.add(i);
        }
        return true;
    }
    // Time: O(1), Space: O(1)
    public boolean isHappyTwoPointer(int n) {
        if (n <= 0) return false;
        int fast = n, slow = n;
        while(true) {
            fast = transform(transform(n));
            slow = transform(n);
            if (fast == 1) return true;
            if (fast == slow) return false;
        }
    }

    private static final boolean[] happy = new boolean[101];
    static {
        happy[1] = true; happy[7] = true; happy[10] = true; happy[13] = true;
        happy[19] = true; happy[23] = true; happy[28] = true; happy[31] = true;
        happy[32] = true; happy[44] = true; happy[49] = true; happy[68] = true;
        happy[70] = true; happy[79] = true; happy[82] = true; happy[86] = true;
        happy[91] = true; happy[94] = true; happy[97] = true; happy[100] = true;
    }

    // Time: O(1), Space: O(1)
    public boolean isHappyMath(int n) {
        if (n <= 0) return false;
        while (n > 100)
            n = transform(n);
        return happy[n];
    }


}
