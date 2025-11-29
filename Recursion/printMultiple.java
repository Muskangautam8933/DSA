
import java.util.Scanner;

public class printMultiple{
    public static void printMultipleOfNum(int n , int k){
        if(k==1){
            System.out.print(n);
            return;
        }

        printMultipleOfNum(n, k-1);
        System.out.print(n * k + " ");

    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n : ");
        int n = sc.nextInt();
        System.out.print("Enter k : ");
        int k = sc.nextInt();
       printMultipleOfNum(n , k);
}
}