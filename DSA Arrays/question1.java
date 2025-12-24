
import java.util.Scanner;

//Print negative element only
public class question1{
   public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       System.out.print("Enter size of arrays : ");
       int n = sc.nextInt();

       int arr[] = new int[n];

       System.out.print("Enter arrays element :");
       for(int i = 0; i< n; i++){
          arr[i] = sc.nextInt();
       }

       for(int i = 0; i< n; i++){
         if(arr[i] < 0 ){
            System.out.print(arr[i] + " ");
         }
       }
   }
}