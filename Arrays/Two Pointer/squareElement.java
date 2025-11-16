public class squareElement {

    public static int[] squareArr(int arr[]) {
        int n = arr.length;
        int left = 0, right = n - 1;
        int ans[] = new int[n];
        int k = n - 1;  // fill from end

        while (left <= right) {
            if (Math.abs(arr[left]) > Math.abs(arr[right])) {
                ans[k] = arr[left] * arr[left];
                left++;
            } else {
                ans[k] = arr[right] * arr[right];
                right--;
            }
            k--;
        }

        return ans;
    }

    public static void printArr(int arr[]) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }

    public static void main(String[] args) {
        int arr[] = {2, 4, 6, 7, 10};

        int result[] = squareArr(arr);
        printArr(result);   // print the squared sorted array
    }
}
