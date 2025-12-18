
import java.util.Scanner;

public class fibonacciSeries{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number upto you want to print fibonacci series : ");
        int n = sc.nextInt();

        int a = 0 , b = 1;
        
        for(int i = 0; i< n; i++){
            System.out.print(a+" ");
            int next = a + b;
            a = b;
            b = next; 
        }
    }
}