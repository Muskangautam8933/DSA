
import java.util.Scanner;

public class factorial{
    static int factorialNumber(int n){
        //base case
        if(n==0){
            return 1;
        }
        //smaller sub problem
        int smallerAns = factorialNumber(n-1);
        int ans = n*smallerAns;
        return ans; 

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any number : ");
        int n = sc.nextInt();
        
        System.out.print("factorial of the number is : "+ factorialNumber(n));
    }
}