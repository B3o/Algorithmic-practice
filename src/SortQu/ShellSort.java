package SortQu;

/**
 * 希尔排序就是使用了gap序列的插入排序
 * @author Bmo
 * @date 2019/11/4 10:14
 */
public class ShellSort {
    public void sort(int[] arr) {
        if (arr == null || arr.length == 0) return;
        for (int gap = arr.length>>1; gap > 0; gap >>= 1) {
            for (int i = gap; i < arr.length; ++i) {
                int cur = arr[i];
                int j = i - gap;
                while (j >= 0 && arr[j] > cur) {
                    arr[j + gap] = arr[j];
                    j -= gap;
                }
                arr[j + gap] = cur;
            }
        }
    }
}
