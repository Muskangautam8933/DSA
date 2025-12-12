
import java.util.Scanner;

public class findPrefixSumWithQueries{
    public static int[] prefixSumQuery(int arr[]){
        int n = arr.length;

        for(int i = 1; i < n; i++){
            arr[i] = arr[i] + arr[i-1];
        }
        return arr;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of array : " );
        int n = sc.nextInt();
        int arr[] = new int[n];

        System.out.print("Enter array element : ");
        for(int i = 0; i< n; i++){
            arr[i] = sc.nextInt();
        }

        int pref[] = prefixSumQuery(arr);
        System.out.print("Enter the number of queries : ");
        int q = sc.nextInt();

        while(q-- > 0){
           System.out.print("Enter range : ");
           int l = sc.nextInt();
           int r = sc.nextInt();

           if (l < 1 || r > n || l > r) {
                System.out.print("Invalid range: [" + l + ", " + r + "]");
                continue;
            }

            // Convert to prefix indices (0-based)
            int R = r - 1;
            int ans = (l == 1) ? pref[R] : pref[R] - pref[l - 2];

            System.out.println("Sum[" + l + "," + r + "] = " + ans);

        }
    }
}