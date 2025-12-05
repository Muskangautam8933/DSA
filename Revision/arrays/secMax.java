//Program to find the second-largest element in the given array
public class secMax{
    public static int secondMax(int arr[]){
        int n = arr.length;
        int max = Integer.MIN_VALUE;
        int secMax = Integer.MIN_VALUE;

        for(int i = 0; i< n;i++){
            if(arr[i] > max){
                max = arr[i];
            }
        } 

        for(int i = 0; i< n; i++){
            if(arr[i] > secMax && arr[i] != max){
                secMax = arr[i];
            }
        }
        return secMax;
    }
    public static void main(String[] args) {
      int arr[] = {4,2,6,9,0,5,6,7};
      System.out.print("Second maximum element in the array is : "+secondMax(arr));

    }
}