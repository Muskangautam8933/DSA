
import java.util.Scanner;

//Print product of arrays element only
public class question3{
   public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       System.out.print("Enter size of arrays : ");
       int n = sc.nextInt();

       int arr[] = new int[n];

       System.out.print("Enter arrays element :");
       for(int i = 0; i< n; i++){
          arr[i] = sc.nextInt();
       }
       int product = 1;
       for(int i = 0; i< n; i++){
          product = product * arr[i];
       }
       System.out.print("product of array element are : " + product);
   }
}