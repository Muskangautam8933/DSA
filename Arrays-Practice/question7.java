public class question7{

    public static boolean twoSum(int arr[] , int target){
        int n = arr.length;
         for(int i = 0;i <n;i++){
            for(int j = i+1; j < n; j++){
                if(arr[i] + arr[j] == target){
                    return true;
                }
                
            }
        }
            return false;
    }
    public static void main(String[] args) {
        
        int arr[] =  {2 ,4 ,5 ,6 ,7, 9 ,10,8};
        int target = 18;
        twoSum(arr, target);
        System.out.print("sum of two numbers :"+ twoSum(arr, target));

    }

   
}