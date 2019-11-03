package SortQu;

import Conn.ConnUtils;

/**
 * @author Bmo
 * @date 2019/11/3 17:22
 */
public class SelectionSort {
    public static void sort(int[] arr) {
        if (arr == null || arr.length == 0) return;
        int n = arr.length;
        for (int i = 0; i < n; ++i) {
            int minIdx = i;
            for (int j = i + 1; j < n; ++j) {
                if (arr[j] < arr[minIdx]) {
                    minIdx = j;
                }
            }
            ConnUtils.swap(arr, i, minIdx);
        }

    }

    /**
     * 从右往左的版本
     * @param arr
     */
    public static void sortFromEnd(int[] arr) {
        if (arr == null || arr.length == 0) return;
        int n = arr.length;
        for (int i = n - 1; i > 0; --i) {
            int maxIdx = i;
            for (int j = 0; j < i; ++j) {
                if (arr[j] > arr[maxIdx]) {
                    maxIdx = j;
                }
            }
            ConnUtils.swap(arr, i, maxIdx);
        }
    }

}
