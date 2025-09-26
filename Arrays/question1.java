//Given array print only negative numbers
public class question1{
    public static void main(String[] args) {
    
     int[] arr = {3,-1, 5,-4 ,6, 4 ,-3,2};
     int n = arr.length;

     // Print only -ve numbers
    //  for(int i = 0 ; i < n; i++){
    //     if(arr[i] < 0){
    //         System.out.print(arr[i] + " ");
    //     }
    //  }




     // Print only +ve numbers
     for(int i = 0 ; i < n; i++){
        if(arr[i] > 0){
            System.out.print(arr[i] + " ");
        }
     }
    }
}