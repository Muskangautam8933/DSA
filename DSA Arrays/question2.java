
import java.util.Scanner;

//Print sum of arrays element only
public class question2{
   public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       System.out.print("Enter size of arrays : ");
       int n = sc.nextInt();

       int arr[] = new int[n];

       System.out.print("Enter arrays element :");
       for(int i = 0; i< n; i++){
          arr[i] = sc.nextInt();
       }
       int sum = 0;
       for(int i = 0; i< n; i++){
          sum = sum + arr[i];
       }
       System.out.print("sum of array element are : " + sum);
   }
}