
import java.util.Scanner;

public class reverseArrays{
    public static void reverse(int arr[]){
        int i = 0, j = arr.length -1;
        while(i < j){
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;

            i++;
            j--;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of array: ");
        int n = sc.nextInt();
        int arr[] = new int[n];

        System.out.print("Enter array elements : ");
        for(int i = 0; i< n ;i++){
            arr[i] = sc.nextInt();
        }
 
      reverse(arr);
      System.out.print("Reversed array is: ");
      for(int i = 0; i < n; i++){
          System.out.print(arr[i] + " ");
      }
      System.out.println();
        

    }
}