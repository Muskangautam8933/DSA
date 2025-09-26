import java.util.*;
public class printArr{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[10];
        int n = arr.length;

        for(int i = 0 ;i<n ; i++){
            arr[i] = sc.nextInt();
            System.out.print(arr[i] + " ");
        }
    }
}