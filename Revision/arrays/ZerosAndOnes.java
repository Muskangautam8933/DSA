//Sort an array consisting of only 0s and 1s
public class ZerosAndOnes{
    public static void zeroOne(int arr[]){
        int n = arr.length;
        int left = 0, right = n-1;

        while(left <= right){
            if(arr[left] == 0){
              left++;
            }

            else if(arr[right] == 1){
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
    public static void main(String args[]){
        int arr[] = {1,0,0,1,1,0,1,0};
        zeroOne(arr);


        System.out.print("Sorted Array: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        
    }
}