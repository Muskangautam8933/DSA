public class printMin7{
    public static int findMin(int arr[]){
        int n = arr.length;
        int min = Integer.MAX_VALUE;

        for(int i = 0; i<  n; i++){
            if(arr[i] < min){
                min = arr[i];
            }
        }
        return min;
    }
    public static void main(String[] args) {
        int arr[] = {2,3,4,7,5,10};
        System.out.println("Min element is : "+findMin(arr));

    }
}