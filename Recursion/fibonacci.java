
import java.util.Scanner;

public class fibonacci{
    static int fibonacciSeries(int n){
        if(n == 0 || n == 1){
            return n;
        }
        int prev = fibonacciSeries(n-1);
        int preprev = fibonacciSeries(n-2);
        int ans = prev+preprev;
        return ans;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number upto you want to print fibonacci series : ");
        int n = sc.nextInt();
        for(int i= 0; i<= n; i++){
            System.out.print(fibonacciSeries(i)+ " ");
        }
    }
}