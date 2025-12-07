//In an array 'a' move all even integers at the beginning followed by all odd integers
public class sortedArr{
    public static void sortEvenAndOdd(int arr[]){
        int n = arr.length;
        int left = 0 , right = n-1;

        while(left <= right){

            if(arr[left] % 2 == 0){
                left++;
            }

            else if(arr[right] % 2 == 1){
                right--;
            }

            else{
                int temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;

                left++;
                right--;
            }
        }
    }
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6,7,8,9};
        sortEvenAndOdd(arr);
        int n = arr.length;

        System.out.print("Sorted arr : ");
        for(int i = 0; i < n; i++){
            System.out.print(arr[i] + " ");
        }
    }
}