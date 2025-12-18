public class printPositive4{
    public static void printPositiveElem(int arr[]){
        int n = arr.length;
        boolean found = false;

        for(int i = 0; i< n; i++){
            if(arr[i] > 0){
               System.out.println("Positive elements are : " + arr[i]);
               found = true;
            }
        }
        if(!found){
            System.out.print("No positive element found");
        }
    }
    public static void main(String[] args) {
        int arr[] = {1,-2,4,-3,6,-9,7};
        printPositiveElem(arr);
    }
}