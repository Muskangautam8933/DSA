public class question1{
    public static void main(String args[]){
        int arr[] = {7,1,4,3,8,7};
        int n = arr.length;

        for(int i = 0; i< n-1; i++){
            int swap = 0;

            for(int j = 0; j < n-1; j++){
                if(arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    swap++;
                }
                
            }
            if(swap == 0) break;
            
        }

        for(int i = 0; i< n; i++){
            System.out.print(arr[i]+" ");
        }
    }
}