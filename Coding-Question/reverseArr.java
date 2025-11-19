public class reverseArr{
    public static int reverse(int arr[]){
        int n = arr.length;
        int i = 0 , j = arr.length - 1;

        while(i < j){
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;

            i++;
            j--;
        }
        return 0;

    }
    public static void main(String[] args) {
        int arr[] = {3,5,2 ,6, 8,4,0,1};
        
      
        reverse(arr);

        System.out.print("Reversed array: ");
        for(int x : arr){
            System.out.print(x + " ");
        }
    }
}