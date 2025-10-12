public class question3{
    public static void main(String args[]){
        int arr[] = {2 ,4 ,6 ,8 ,1};
        int n = arr.length;
         int product = 1;
        for(int i = 0; i<n; i++){
           product *= arr[i];
        }
        System.out.print("Sum of array element are : "+ product);
    }
}