
import java.util.Scanner;

public class moveEvenAndOdd{

    public static int evenOddArr(int arr[]){
        int left = 0 , right = arr.length-1;
        while(left < right){
            if (arr[left] % 2 == 0) {
                left++;
            }else if(arr[right] % 2 != 0){
                right--;
            }
            else{
                int temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;
                left++;
                right--;
            }

        }
        return 0;
    }
    public static void printArr(int arr[]) {
        int n = arr.length;
        for(int i = 0;i<n;i++){
            System.out.print(arr[i] + " ");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter array size : ");
        int n = sc.nextInt();
        int arr[] = new int[n];

        System.out.print("Enter array elements : ");
        for(int i = 0; i< n; i++){
            arr[i] = sc.nextInt();
        }
        evenOddArr(arr);
        printArr(arr);

    }
}