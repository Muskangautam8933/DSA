
import java.util.Scanner;

//Print secMax element only
public class question8{
    public static int max(int arr[]){
         int n = arr.length;
         int max = Integer.MIN_VALUE;

         for(int i = 0; i< n; i++){
            if(arr[i] > max ){
                max = arr[i];
            }
         }
         return max;
    }
     public static int secMax(int arr[]){
         int n = arr.length;
         int secMax = Integer.MIN_VALUE;
         int max = max(arr);

         for(int i = 0; i< n; i++){
            if(arr[i] > secMax && arr[i] != max){
                secMax = arr[i];
            }
         }
         return secMax;
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
       
        System.out.println("Max is  : "+ max(arr));
       System.out.print("secMax is  : "+ secMax(arr));
   }
}