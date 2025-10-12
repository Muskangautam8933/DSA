import java.util.*;
public class question9{
    public static void main(String[] args) {
        int arr[] = {2 ,4 , 6, 8, 9,10};
        int n = arr.length;
        for(int i = 0; i< n/2;i++){
           int temp = arr[i];
           arr[i] = arr[n-1-i];
           arr[n-1-i] = temp;
        }
        System.out.print(Arrays.toString(arr));
    }
}