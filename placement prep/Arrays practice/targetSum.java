
import java.util.Scanner;

public class targetSum{
    public static int findTargetSum(int arr[], int targetNum){
        int n = arr.length;
        int ans = 0;

        for(int i = 0; i<n ;i++){
            for(int j = i+1; j < n ; j++ ){
                if(arr[i]+arr[j] == targetNum){
                    ans++;
                }
            }
        }
        return ans;

    }
    public static void main(String[] args) {
      int arr[] = { 1 ,-2 ,3 ,-4 ,6 ,-5};
      int targetNum = 4;
      System.out.println("your target number is available in array at "+ findTargetSum(arr, targetNum)+" times");
      
        
    }
}