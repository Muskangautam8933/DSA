
import java.util.Arrays;
import java.util.Scanner;



public class prefixSum{
    public static int[] prefixSumArr(int arr[]){
        int n = arr.length;

        for(int i = 1; i< n; i++){
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

        int result[] = prefixSumArr(arr);
        System.out.println(Arrays.toString(result));

    }
}