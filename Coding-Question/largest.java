public class largest{
    public static int findLargest(int arr[]){
        int n = arr.length;
        int max = Integer.MIN_VALUE;
         
         for(int i =0; i< n; i++){
            if(arr[i] > max){
                max = arr[i];
            }
         }
         return max;
    }
    public static void main(String[] args) {
        int arr[] = {2 , 4 , 6, 8, 10};
        int result = findLargest(arr);

        System.out.println("Your largest element is : "+ result);
        
    }
} 