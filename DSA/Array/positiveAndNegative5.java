public class positiveAndNegative5{
    public static void printPositiveAndNegativeElem(int arr[]){
        int n = arr.length;

        for(int i = 0; i< n; i++){
            if(arr[i] > 0){
               System.out.println("Positive elements are : " + arr[i]);
            }else{
                System.out.println("Negative element are : " + arr[i]);
            }
        }
    }
    public static void main(String[] args) {
        int arr[] = {1,-2,4,-3,6,-9,7};
        printPositiveAndNegativeElem(arr);
    }
}