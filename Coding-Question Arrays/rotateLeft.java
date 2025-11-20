public class rotateLeft{

    public static void reverse(int arr[], int start, int end) {
       while(start < end){
        int temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;

        start++;
        end--;
       }
    }
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5, 6, 7};
        int n = arr.length;
        int k = 2;
        k = k % n;

       // Step 1
        reverse(arr, 0, k - 1);

        // Step 2
        reverse(arr, k, n - 1);

        // Step 3
        reverse(arr, 0, n - 1);


        for(int ele : arr){
            System.out.print(ele + " ");
        }
    }
}