//WAP to print minimum element of array
import java.util.*;
public class minElement{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int[] arr = {3 , 5 , 7 , 8 , 2 , 0};

        int min = Integer.MAX_VALUE;
        for(int i =0 ; i<arr.length;i++){
            if(arr[i] < min){
               min = arr[i];
            }
        }
        System.out.print("Minimum element from array are : " +min);
    }
}