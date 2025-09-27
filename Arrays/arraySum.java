// //WAP to print the sum of array element
import java.util.*;
public class arraySum{
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        System.out.print("Enter the size of array : ");
        int n = sc.nextInt();

        int[] arr = new int[n];
        int sum = 0;

        for(int i = 0; i< n; i++){
            System.out.print("Array elements are [" + i +"]: ");
            arr[i] = sc.nextInt();
            sum = sum + arr[i];
        }

        System.out.println("Sum of array elements are :" + sum);
    }
}



























// import java.util.*;
// public class arraySum{
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter the size of array");
//         int n = sc.nextInt();

//         int[] arr = new int[n];
//         int sum = 0;


       
//         for(int i = 0 ; i< n; i++){
//             System.out.print("Element [" + i + "]: ");
//             arr[i] = sc.nextInt();
//             sum += arr[i];
           
//         }

//                System.out.println("The sum of the array elements is: " + sum);

//     }
// }



