public class secLargest{
    public static int largest(int arr[]){
        int n = arr.length;
        int max = Integer.MIN_VALUE;
        int secMax = Integer.MIN_VALUE;

        for(int i = 0; i< n; i++){
            if(arr[i] > max){
                max = arr[i];
            }
        }
        return max;
    }

    public static int secondMax(int arr[]){
        int n = arr.length;
        int secMax = Integer.MIN_VALUE;

        int max = largest(arr);
        for(int i = 0; i< n; i++){
            if(arr[i] != max && arr[i] > secMax){
                secMax = arr[i];
            }
        }
        return secMax;

    }
    public static void main(String[] args) {
        int arr[] = {2 ,67, 92 ,8, 10 ,12 ,14};
        int result = secondMax(arr);

        System.out.println("your second max is  : "+ result);


    }
}