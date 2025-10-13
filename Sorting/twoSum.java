
import java.util.Arrays;
public class twoSum{
    public static boolean  twoSumExist(int arr[] , int target){
       Arrays.sort(arr);
       int i =0 , j = arr.length-1;

       while(i < j){
        if(arr[i]+arr[j] == target){
            return true;
        }else if(arr[i]+arr[j] > target){
            j--;
        }
        else if(arr[i]+arr[j] < target){
            i++;
        }
       }
       return false;
    }
  public static void main(String[] args) {
        int arr[] = {1,4,45,6,10,8};
        int target = 16;
       
       boolean result = twoSumExist(arr, target);
       System.out.print(result+" ");

       
    }
}
