
import java.util.Scanner;

//WAP To print product of array elements
public class productArr{
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        System.out.print("Enter the size of arrray : ");
        int n = sc.nextInt();

        int[] arr = new int[n];
        int product = 1;

        for(int i = 0; i < n; i++){
            System.out.print("Array elements are  [" + i +"] : ");
            arr[i] = sc.nextInt();
            product *= arr[i];
        }

        System.out.print("Products of array elements are :" + product);
    }
}