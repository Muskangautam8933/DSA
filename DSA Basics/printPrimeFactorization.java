
import java.util.Scanner;

public class printPrimeFactorization{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number : ");
        int n = sc.nextInt();
        
        for(int i = 2; i <=  n /2 ; i++){
            while(n % i == 0){
                n = n / i;
                System.out.println(i);
            }
        }

        if(n != 1){
            System.out.println(n+" ");
        }

        

    }
}