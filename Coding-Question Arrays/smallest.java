public class smallest{
    public static int smallest(int arr[]){
        int n = arr.length;
        int min = Integer.MAX_VALUE;


        for(int i = 0; i<n; i++){
            if(arr[i] <  min){
                min = arr[i];
            }
        }
        return min;

    }
    public static void main(String[] args) {
        int arr[] = {4, 6, 2 ,7 , 10,35, 65};
        int result = smallest(arr);

        System.out.println("Your smallest element are : "+ smallest(arr));
        
    }
}