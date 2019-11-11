package SortQu;

/**
 * @author Bmo
 * @date 2019/11/11 10:55
 */
public class QuickSort {
    private void swap(int[] arr, int i, int j) {
        int tmp = arr[i];
        arr[i] = arr[j];
        arr[j] = tmp;
    }
    private int lomutoPartition(int[] arr, int low, int high) {
        int pivot = arr[high];
        int i = low;
        for (int j = low; j < high; ++j) {
            if (arr[j] < pivot) {
                swap(arr, i, j);
                ++i;
            }
        }
        swap(arr, i, high);
        return i;
    }
    private void lomutoSort(int[] arr, int low, int high) {
        if (low < high) {
            int k = lomutoPartition(arr, low, high);
            lomutoSort(arr, low, k-1);
            lomutoSort(arr, k+1, high);
        }
    }

    /**
     * Lomuto分割方法，实现简单，不易出错，效率差一些
     * Time: O(n*log(n)), Space:O(n)
     * @param arr
     */
    public void lomutoSort(int[] arr) {
        if (arr == null || arr.length == 0) return;
        lomutoSort(arr, 0, arr.length - 1);
    }


    private int hoarePartition(int[] arr, int low, int high) {
        int pivot = arr[low + (high - low)/2];
        int i = low, j = high;
        while (true) {
            while (arr[i] < pivot) ++i;
            while (arr[j] > pivot) --j;
            if (i >= j) return j;
            swap(arr, i++, j--);
        }
    }
    private void hoareSort(int[] arr, int low, int high) {
        if (low < high) {
            int k = hoarePartition(arr, low, high);
            hoareSort(arr, low, k);
            hoareSort(arr, k+1, high);
        }
    }

    /**
     * 霍尔分割方法
     * Time: O(n*log(n)), Space:O(n)
     * @param arr
     */
    public void hoareSort(int[] arr) {
        if (arr == null || arr.length == 0) return;
        hoareSort(arr, 0, arr.length - 1);
    }
}
