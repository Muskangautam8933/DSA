
import java.util.Scanner;

//Print reverse arrays element only
public class question9{
    public static int[] reverse(int arr[]){
         int i = 0, j = arr.length-1;
        
         while(i < j){
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;

            i++;
            j--;
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
        
        int result[] = reverse(arr); 

        System.out.print("Reverse array : ");
        for(int i = 0; i< n; i++){
            System.out.print(result[i] + " ");
        }
   }
}