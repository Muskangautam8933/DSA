
import java.util.Scanner;

//Print min element only
public class question5{
    public static int min(int arr[]){
         int n = arr.length;
         int min = Integer.MAX_VALUE;

         for(int i = 0; i< n; i++){
            if(arr[i] < min){
                min = arr[i];
            }
         }
         return min;
    }
   public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       System.out.print("Enter size of arrays : ");
       int n = sc.nextInt();
       

       int arr[] = new int[n];

       System.out.print("Enter arrays element :");
       for(int i = 0; i< n; i++){
          arr[i] = sc.nextInt();
       }
       

       System.out.print("max is  : "+ min(arr));
   }
}