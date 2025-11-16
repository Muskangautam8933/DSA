
import java.util.Scanner;

public class arraysSum{ 
    public static int sumOfArray(int arr[]){
        int n = arr.length;
        int sum = 0;

        for(int i = 0; i< n; i++){
            sum = sum + arr[i];
        }
      return sum;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of arrays : ");
        int n = sc.nextInt();

        int arr[] = new int[n];

        System.out.print("Enter array elements : ");
        for(int i = 0; i< n; i++){
            arr[i] = sc.nextInt();
        }
        
        int result = sumOfArray(arr);
        System.out.println("Sum of array: " + result);
    }
}