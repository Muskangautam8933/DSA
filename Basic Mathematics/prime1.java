import java.util.Scanner;
public class prime1{
    public static boolean printPrimeNum(int n){
        if(n == 0 || n == 1){
            return false;
        }

        for(int i = 2; i<n; i++){
            if(n % i == 0){
                return false;
            }
        }
        return true;

    }
   public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       System.out.print("Enter N : ");
       int n = sc.nextInt();

       for(int i = 1;i <= n; i++){
        if(printPrimeNum(i)){
            System.out.print(i+" ");
        }
       }
   }
    
}





