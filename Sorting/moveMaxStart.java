public class moveMaxStart{
    public static void main(String[] args) {
         int arr[] = {5,-2,6,7,3,8,0};
         int n = arr.length;
         
         for(int i = 0; i< n; i++){
            int max = Integer.MIN_VALUE , minIndex= -1;
            for(int j = i; j < n;j++){
                if(arr[j] > max){
                    max = arr[j];
                    minIndex = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[minIndex];
            arr[minIndex] = temp;

            System.out.print(arr[i]+" ");
         }
    }
}