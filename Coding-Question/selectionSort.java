public class selectionSort{
    public static void main(String[] args) {
        int arr[] = {2,4,1,6,3,8,7,9,0,1,3,2,4};
        int n = arr.length;
      
       for(int i = 0; i<n-1; i++){
        int minIndex = i;
        for(int j = i+1; j < n-1; j++){
            if(arr[j] < arr[minIndex]){
                minIndex = j;
            }
        }

        int temp = arr[i];
        arr[i] = arr[minIndex];
        arr[minIndex] = temp;
       }

       for(int ele:arr){
        System.out.print(ele+ " ");
       }
        
    }
}