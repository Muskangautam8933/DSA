public class printNegative3{
    public static void printNegElem(int arr[]){
        int n = arr.length;
        boolean found = false;

        for(int i = 0; i< n; i++){
            if(arr[i] < 0){
               System.out.println("Negative elements are : " + arr[i]);
               found = true;
            }
        }
        if(!found){
            System.out.print("No neg element found");
        }
    }
    public static void main(String[] args) {
        int arr[] = {1,-2,4,-3,6,-9,7};
        printNegElem(arr);
    }
}