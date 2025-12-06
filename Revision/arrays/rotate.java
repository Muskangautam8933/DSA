
public class rotate {
    public static void rotateArr(int arr[], int k, int ans[]) {
        int n = arr.length;
        k = k % n; // handle k > n case
        int j = 0;

        // Copy last k elements to the front
        for (int i = n - k; i < n; i++) {
            ans[j++] = arr[i];
        }

        // Copy first (n - k) elements
        for (int i = 0; i < n - k; i++) {
            ans[j++] = arr[i];
        }

        // Print rotated array
        System.out.print("Rotated array: ");
        for (int num : ans) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5, 6};
        int k = 2;
        int n = arr.length;
        int ans[] = new int[n];

        rotateArr(arr, k, ans);
    }
}
