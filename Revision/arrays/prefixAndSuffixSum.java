
import java.util.Scanner;

public class prefixAndSuffixSum{
    public static int totalSum(int arr[]){
        int n = arr.length;
        int totalSum = 0;

        for(int i = 0; i< n; i++){
            totalSum = totalSum + arr[i];
        }
        return totalSum;
    }

    public static boolean equalSumPartition(int arr[]){
        int n = arr.length;
        int prefixSum = 0;
        int totalSum = totalSum(arr);

        for(int i = 0; i< n; i++){
        prefixSum = prefixSum + arr[i];
         
        int suffixSum = totalSum - prefixSum;

        if(suffixSum == prefixSum){
            return true;
        }
        }
         return false;
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

        equalSumPartition(arr);
    }
}