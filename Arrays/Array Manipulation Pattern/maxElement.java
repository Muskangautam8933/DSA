//WAP to print the maximum element in the array
import java.util.*;
public class maxElement{
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      int[] arr = {9, 4 ,5 ,6,9,10};


      int max = Integer.MIN_VALUE;
      for(int i = 0;i<arr.length;i++){
         if(arr[i] > max){
            max = arr[i];
         }
        
      }
       System.out.print("Maximum of array elements are :" + max);

    }
}