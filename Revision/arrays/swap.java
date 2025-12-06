//.Swap using temporary variable
import java.util.Scanner;

public class swap{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your first number : ");
        int x = sc.nextInt();
        System.out.print("Enter your first number : ");
        int y = sc.nextInt();
        
        int temp = x;
        x = y;
        y= temp;

        System.out.println("valueof x : "+ x);
        System.out.print("valueof y : "+ y);

    }
}