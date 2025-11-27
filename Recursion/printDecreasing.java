
import java.util.Scanner;

public class printDecreasing{
    static void pD(int n){
        if(n == 1){
            System.out.print(n);
            return;
        }
        System.out.print(n+" ");
        pD(n-1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the range you want to decrease : ");
        int n = sc.nextInt();
        pD(n);

    }
}