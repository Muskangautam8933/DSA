public class question2{
    public static void main(String[] args) {
        int arr[] = {7,1,4,3,8,7};
        int n = arr.length;

        for(int i = 0; i<n; i++){
            int min = Integer.MAX_VALUE , minIndex = -1;
            for(int j = i; j< n; j++){
                if(arr[j] < min){
                    min = arr[j];
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