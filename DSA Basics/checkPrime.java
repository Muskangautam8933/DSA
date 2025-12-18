
import java.util.Scanner;

public class checkPrime{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any number upto you want to check : ");
        int n = sc.nextInt();

        if(n <=  1){
            System.out.println("Not prime");
            return;
        }
         
         boolean isPrime = true;
        for(int i = 2; i< n/2; i++){
            if(n % i == 0){
               isPrime = false;
               break;
            }
        }
        if(isPrime){
            System.out.println("Prime");
        }else{
            System.out.println("Not prime");
        }


    } 
}