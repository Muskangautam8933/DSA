
import java.util.Scanner;

//Multiply odd indexed elements by 2 and add 10 to even indexed elements
public class question6{
    public static int[] addANDMultiple(int arr[]){
         int n = arr.length;

         for(int i = 0; i< n; i++){
            if(i % 2 == 0 ){
                arr[i] =  arr[i] + 10; 
            }else{
                arr[i] =  arr[i] * 2;
            }
         }
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
       
       int result[] = addANDMultiple(arr);
       
       System.out.print("result array : ");
       for(int i = 0; i< n ;i++){
          System.out.print(result[i]+" ");
       }

       
   }
}