public class insertionSort{
    public static void main(String[] args) {
        int arr[] = {4,1,7,3,9,2,0,8};
        int n = arr.length;

        for(int i = 1; i< n;i++){
            int j = i;
            while(j > 0 && arr[j] < arr[j-1]){
                int temp = arr[j];
                arr[j] = arr[j-1];
                arr[j-1] = temp;
                j--;
            }
            
        }
        for(int ele : arr){
            System.out.print(ele+" ");
        }
    }
}