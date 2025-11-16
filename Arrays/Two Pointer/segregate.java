
import java.util.Scanner;

public class segregate{
    public static int segregateNumber(int arr[]){
        int left = 0 , right = arr.length-1;
        while(left < right){
            if(arr[left] == 0){
                left++;
            }else if(arr[right] == 1){
                right--;
            }else{
                int temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;
                left++;
                right--;
            }

          
        }
        return 0;
    }

    public static void printArr(int arr[]){
        int n = arr.length;
        for(int i = 0; i< n ; i++){
           System.out.print(arr[i]+" ");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of array : ");
        int n = sc.nextInt();
        int arr[] = new int[n];

        System.out.print("Enter the element in the array : ");
        for(int i = 0; i< n; i++){
            arr[i] = sc.nextInt();
        }
        segregateNumber(arr);
        printArr(arr);

       
    }
}







// public class segregate{
//     public static void segregate(int arr[]){
//         int n = arr.length;
//         int left = 0 , right = n-1;

//         while(left < right){
//             if(arr[left] == 0 && arr[right] == 1 ){
//                 int temp = arr[left];
//                 arr[left] = arr[right];
//                 arr[right] = temp;

//                 left++;
//                 right--;
//             }
//             if(arr[left] == 0){
//                 left++;
//             }

//             if(arr[right] == 1){
//                 right--;
//             }

           
//         }
//     }
//     public static void main(String[] args) {
//         int arr[] = {1, 1, 0, 0, 1, 1, 0, 1, 0};


//     }
// }