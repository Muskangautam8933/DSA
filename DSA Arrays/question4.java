
import java.util.Scanner;

//Print max element only
public class question4{
    public static int max(int arr[]){
         int n = arr.length;
         int max = Integer.MIN_VALUE;

         for(int i = 0; i< n; i++){
            if(arr[i] > max){
                max = arr[i];
            }
         }
         return max;
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
       

       System.out.print("max is  : "+ max(arr));
   }
}