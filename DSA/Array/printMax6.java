public class printMax6{
    public static int findMax(int arr[]){
        int n = arr.length;
        int max = Integer.MIN_VALUE;

        for(int i = 0; i<  n; i++){
            if(arr[i] > max){
                max = arr[i];
            }
        }
        return max;
    }
    public static void main(String[] args) {
        int arr[] = {2,3,4,7,5,10};
        System.out.println("Max element is : "+findMax(arr));

    }
}