public class question9{
    public static void printArr(int arr[]){
        int n = arr.length;

        for(int i = 0; i< n; i++){
            if(i % 2 == 0){
                arr[i] = arr[i] + 10;  //even idx add by 10
            }else{
                arr[i] = arr[i] * 2;  //odd idx multiply by 2
            }
        }
    }
    public static void main(String[] args) {
        int arr[] = {1,2,4,6,8,10};
        printArr(arr);
        for(int i = 0; i< arr.length; i++){
            System.out.print(arr[i] + " ");
        }
         

    }
}