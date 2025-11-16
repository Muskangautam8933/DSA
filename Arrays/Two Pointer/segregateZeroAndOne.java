
public class segregateZeroAndOne {

    public static void segregate(int arr[]) {
        int n = arr.length;
        //This is brute force approach.
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] == 0) {
                count++;
            }
        }
        for (int i = 0; i < n; i++) {
            if (i < count) {
                arr[i] = 0;
            } else {
                arr[i] = 1;
            }
            System.out.print(arr[i] + " ");
        }
    }

    public static void main(String[] args) {
        int arr[] = {1, 1, 0, 0, 1, 1, 0, 1, 0};
        segregate(arr);

    }
}
