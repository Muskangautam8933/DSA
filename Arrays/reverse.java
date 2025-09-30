
import java.util.Arrays;

public class reverse {
    public static void main(String args[]) {
        int arr[] = {4, 5, 8, 2, 9, 8, 6};
        int n = arr.length;
        for (int i = 0; i < n / 2; i++) {
            int temp = arr[i];
            arr[i] = arr[n - 1 - i];
            arr[n - 1 - i] = temp;
        }
        System.out.println(Arrays.toString(arr));

    }
}
