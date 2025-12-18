
import java.util.Scanner;

public class primeNumber{
    public static boolean printPrimeNumber(int n){
        if(n == 0 || n == 1){
            return false;
        }
        for(int i = 2 ; i < n; i++){
            if(n % i == 0){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter num : ");
        int n = sc.nextInt();

        
        for(int i = 1 ;i < n;i++){
            if(printPrimeNumber(i)){
                System.out.print(i +" ");
            }
        }
    }
}