package SortQu;

import Conn.ConnUtils;

/**
 * @author Bmo
 * @date 2019/10/30 15:53
 */
public class BubbleSort {
    public void sort(int[] arr) {
        if (arr == null || arr.length == 0) return;
        int n = arr.length;
        for (int end = n-1; end > 0; --end) {
            for (int i = 0; i < end; ++i) {
                if (arr[i] > arr[i+1]) {
                    ConnUtils.swap(arr, i, i+1);
                }
            }
        }
    }
    public void sortEarlyReturn(int[] arr) {
        if (arr == null || arr.length == 0) return;
        int n = arr.length;
        boolean swapped;
        for (int end = n-1; end > 0; --end) {
            swapped = false;
            for (int i = 0; i < end; ++i) {
                if (arr[i] < arr[i+1]) {
                    ConnUtils.swap(arr, i, i+1);
                    swapped = true;
                }
            }
            if (!swapped) return;
        }
    }
    public void sortSkip(int[] arr) {
        if (arr == null || arr.length == 0) return;
        int n = arr.length;
        int newEnd;
        for (int end = n-1; end > 0; ) {
            newEnd = 0;
            for (int i = 0; i < end; ++i) {
                if (arr[i] > arr[i+1]) {
                    ConnUtils.swap(arr, i, i+1);
                    newEnd = i;
                }
            }
            end = newEnd;
        }
    }
}
