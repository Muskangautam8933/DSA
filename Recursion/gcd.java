
import java.util.Scanner;

public class gcd{
    public static int findGcd(int x , int y){
        if(y==0){
            return x;
        }

        return findGcd(y , x% y);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        System.out.print("GCD of these number are : "+findGcd(x, y));
    }
}