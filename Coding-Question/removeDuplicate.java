
public class removeDuplicate {

    public static void main(String[] args) {
        int arr[] = {2, 3, 4, 5, 5, 7, 8, 6, 7, 6, 8, 9, 9, 6};
        int n = arr.length;
        int newArr[] = new int[n];
        int k = 0;

        for (int i = 0; i < n; i++) {
            boolean found = false;

            for (int j = 0; j < k; j++) {
                if (arr[i] == newArr[j]) {
                    found = true;
                    break;
                }
            }
            if (!found) {
                newArr[k] = arr[i];
                k++;
            }
        }

        System.out.print("Array after removing duplicate element from array : ");
        for (int i = 0; i < k; i++) {
            System.out.print(newArr[i] + " ");
        }

    }
}
