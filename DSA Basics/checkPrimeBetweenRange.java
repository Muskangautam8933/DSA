
import java.util.Scanner;

public class checkPrimeBetweenRange{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your range :"); 
        System.out.print("Start from : ");
        int start = sc.nextInt();

        System.out.print(" Upto from : ");
        int end = sc.nextInt();

        for(int n = start ; n <= end ; n++){
            int count = 0;

            for(int div = 2; div <= n/2 ; div++){
                if(n % div == 0){
                    count++;
                    break;
                }
            } 
            if(count == 0){
                System.out.println(n);
            }
        }
        
    }
}