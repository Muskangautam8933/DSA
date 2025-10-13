public class selectionSort{
    public static void main(String[] args) {
        int arr[] = {5,-2,6,7,3,8,0};
        int n = arr.length;

       for(int i = 0;i < n;i++){
        int min = Integer.MAX_VALUE , minInx = -1;
        for(int j = i; j< n; j++){
            if(arr[j] < min){
                min= arr[j];
                minInx = j;
            }
        }
        int temp = arr[i];
        arr[i] = arr[minInx];
        arr[minInx] = temp;

        System.out.print(arr[i] +" ");
       }


        // for(int i =0;i<n-1 ;i++){
        //     int minIndex = i;
           
        //     for(int j = i+1 ; j<n; j++){
        //         if(arr[j] < arr[minIndex]){
        //             minIndex = j;
        //         }
        //     }
        //     int temp = arr[i];
        //     arr[i] = arr[minIndex];
        //     arr[minIndex] = temp;

            
        // }
        //  for (int i = 0; i < n; i++) {
        //     System.out.print(arr[i] + " ");
        // }
    }
}