public class bubbleSort{
    public static void main(String args[]){
        int arr[] = {3, 4 ,1, 2,5 , 8 ,0};
        int n = arr.length;

        for(int i = 0; i<n-1;i++){
            for(int j  = 0; j< n-1; j++){
                if(arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] =  arr[j+1];
                    arr[j+1]= temp;
                }
            }
            //this is first approach time complexity : O(n^2);
        }
        for(int ele : arr){
            System.out.print(ele + " ");
        }

    }
}