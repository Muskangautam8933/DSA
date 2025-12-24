
import java.util.Scanner;

//Print rotate arrays element only
public class question10{
    public static int[] reverse(int arr[] , int i , int j){        
         while(i < j){
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;

            i++;
            j--;
         }
         return arr;
    }
      public static int[] rotate(int arr[] , int d){
         int n = arr.length;
         
         d = d % n;
         
        reverse(arr, 0, d - 1);
        reverse(arr, d, n - 1);
        reverse(arr, 0, n - 1);
         
       return arr;

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

       System.out.print("enter d : ");
       int d = sc.nextInt();
        
        int result[] = rotate(arr, d); 

        System.out.print("Reverse array : ");
        for(int i = 0; i< n; i++){
            System.out.print(result[i] + " ");
        }
   }
}