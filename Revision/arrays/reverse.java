//Reverse an array
public class reverse{
    public static void main(String[] args) {
       int arr[] = {1,2,3,4,5,6};
       int i = 0, j = arr.length-1;

       while(i < j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;

        i++;
        j--;
       }

       for(int elem : arr){
        System.out.print(elem+" ");
       }
    }
}
