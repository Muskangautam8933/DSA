
import java.util.Scanner;

// Program to find a unique number in a given array
public class uniqueNum{
    public static int unique(int arr[] ){
        int n = arr.length;
        for(int i = 0; i < n; i++){
            for(int j = i + 1; j < n; j++){
                if(arr[i] == arr[j]){
                    arr[i] = -1;
                    arr[j] = -1;
                }
            }
        }
        for(int i = 0; i < n; i++){
            if(arr[i] > 0){
                return arr[i];
            }
        }

        return -1;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of array : ");
        int n = sc.nextInt();
        int arr[] = new int[n];

        System.out.print("Enter array elements : ");
        for(int i = 0; i< n; i++){
            arr[i] = sc.nextInt();
        }

        int result = unique(arr);
        System.out.print("Unique element are : "+result);
    }
}