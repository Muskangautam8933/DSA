public class insertionSort{
    public static void main(String[] args) {
        int arr[] = {3,1,5,2,7,8,4,6,5,7};
        int n = arr.length;

        for(int i = 0; i< n; i++){
            for(int j = i+1; j<n;j++){
                if(arr[i] > arr[j]){
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        for(int ele : arr){
            System.out.print(ele + " ");
        }
    }
}