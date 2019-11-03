package Conn;

/**
 * @author Bmo
 * @date 2019/10/30 15:57
 */
public class ConnUtils {
    public static void swap(int [] arr, int i, int j) {
        int tmp = arr[i];
        arr[i] = arr[j];
        arr[j] = tmp;
    }
}
