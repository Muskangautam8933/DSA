public class countEvenAndOdd{
    public static int countEven(int arr[]){
        int n = arr.length;
        int evenCounter = 0;

        for(int i = 0; i< n; i++){
            if(arr[i] % 2 == 0){
                evenCounter++;
            }
        }
        return evenCounter;
    }

    public static int countOdd(int arr[]){
        int n = arr.length;
        int oddCounter = 0;
        for(int i = 0; i< n; i++){
            if(arr[i] % 2 != 0){
                oddCounter++;
            }
        }
        return oddCounter;

    }
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6,7,8,9,10,12,14,66,13};
        System.out.println("Total even numbers are : "+countEven(arr));
        System.out.print("Total odd numbers are : "+ countOdd(arr) );
    }
}