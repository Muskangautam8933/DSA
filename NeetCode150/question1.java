
import java.util.Arrays;

// Given an integer array nums, return true if any value appears at least twice in the array, and return false if every element is distinct.
// Input: nums = [1,2,3,1]
// Output: true
// Explanation:
// The element 1 occurs at the indices 0 and 3.

public class question1{
    public static boolean duplicate(int arr[]){
        int n = arr.length;
        Arrays.sort(arr);

        for(int i = 0; i<n-1; i++){
            if(arr[i] == arr[i+1]){
                return true;
            }
        }
      return false;
    }
    public static void main(String[] args) {
        int arr[] = {1,2,3,1};
        

        System.out.print("Array has duplicate element : "+duplicate(arr));
        
    }
}