
import java.util.Scanner;

//find target Sum
public class question7{
    public static boolean targetSum(int arr[], int target){
         int n = arr.length;

         for(int i = 0; i< n; i++){
           for(int j = 0; j< n; j++){
            if(arr[i] + arr[j] ==  target){
                return true;
            }
           }
         }
         return false;
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
       
       System.out.print("Enter the sum you find : ");
       int target = sc.nextInt();
      
       
       System.out.print("found : "+ targetSum(arr, target));
    //    for(int i = 0; i< n ;i++){
         
    //    }

       
   }
}