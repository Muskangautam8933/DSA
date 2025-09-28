//WAP To print the sum of two element in the array
public class twoSum{

    public static boolean twoSum(int arr[] , int target){
         int n = arr.length;
         for(int i = 0 ; i<n ; i++){
             for(int j = i+1; j < n; j++ ){
                if(arr[i]+arr[j] == target){
                    return true;
                }
             }
         }
         return false;
      
    }
    public static void main(String[] args) {
        int arr[] = {1 , 3, 4, 5, -3,8};
        int target = 2;

        System.out.print("Two Sum : = "+ twoSum(arr, target));
       
    }
}