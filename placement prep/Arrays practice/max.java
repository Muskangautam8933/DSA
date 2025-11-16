public class max{
    public static int findMaxNum(int arr[]){
        int max = Integer.MIN_VALUE;
        int n = arr.length;

        for(int i = 0; i< n; i++){
            if(arr[i] > max){
                max = arr[i];
            }
        }
        return max;
    }
    public static void main(String[] args) {
        int arr[] = {2 ,5 ,3 ,7 ,40 ,7 ,5,46,0,9};
        System.out.println("Your maximum number in array is : "+findMaxNum(arr));
    }
}