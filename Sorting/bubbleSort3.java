//sort arr in everse order using bubble sort
public class bubbleSort3{
    public static void main(String[] args) {
        int arr[] = {3, 4 ,1, 2,5 , 8 ,0};
        int n = arr.length;

       
        for(int i = 0;i < n-1; i++){
            int swap = 0;
            for(int j = 0; j<n-1;j++){
                if(arr[j] < arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    swap++;
                }
            }
            if(swap == 0) break;
        }
        for(int ele: arr){
            System.out.print(ele + " ");
        }
    }
}