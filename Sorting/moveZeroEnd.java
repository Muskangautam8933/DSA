public class moveZeroEnd {
    public static void main(String args[]) {
        int arr[] = {2, 0, 4, 0, 5, 0, 1, 6, 7};
        int n = arr.length;

        int j = 0; // position for next non-zero element

        for(int i = 0; i < n; i++) {
            if(arr[i] != 0) {
                if(i != j) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
                j++;
            }
           
        }
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
