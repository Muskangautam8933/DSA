public class minAndMax{
    public static int getMax(int arr[]){
        int n = arr.length;
        int max = Integer.MIN_VALUE;
        for(int i = 0; i < n; i++){
            if(arr[i] > max){
                max = arr[i];
            }
        }
        return max;

    }
    public static int getMin(int arr[]){
        int n = arr.length;
        int min = Integer.MAX_VALUE;
        for(int i = 0;i<n; i++){
            if(arr[i] < min){
                min = arr[i];
            }
        }
      return min;
    }
    public static void main(String[] args) {
        int arr[] = {5,3,79,57,343,1,643};

        System.out.println("Your maximum element in array is : "+getMax(arr));
        System.out.println("Your minimum element in array is : "+ getMin(arr));
    }
}