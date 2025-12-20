
import java.util.Scanner;

public class lcm{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number : ");
        int num1 = sc.nextInt();
        System.out.print("Enter second number : ");
        int num2 = sc.nextInt();

        int ON = num1;
        int ON2 = num2;

        while(num1 % num2 != 0){
            int rem = num1 % num2;
            num1 = num2;
            num2 = rem;
        }

        int gcd = num2;

        int lcm = (ON * ON2)/gcd;
        System.out.println("GCD is : "+ gcd);
        System.out.println("LCM is : "+ lcm);

    }
}