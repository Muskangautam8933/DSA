public class targetSum10{
    public static void findTargetSum(int arr[],int target){
        int n = arr.length;
        boolean found = false;

       for(int i = 0; i< n; i++){
          for(int j =i+1; j < n ; j++ ){
            if(arr[i] + arr[j] == target){
                System.out.println("pair found : " + arr[i] + " + " + arr[j]+ " " + "= " + target);
                found = true;
            }
          }
       }
     if(!found){
        System.out.println("no target sum found ");
     }
    }
    public static void main(String[] args) {
        int arr[] = {2,5,7,8,10,12,15};
        int target = 14;

       findTargetSum(arr, target);
    }
}