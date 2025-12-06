
import java.util.Scanner;

//.Swap without using temporary variable
public class swapWithoutTemp{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter x : ");
        int x = sc.nextInt();
        System.out.print("Enter y : ");
        int y = sc.nextInt();

        x = x + y;
        y = x - y;
        x = x - y;

        System.out.println("value of x : " + x );
        System.out.print("value of y : " + y );

    }
}