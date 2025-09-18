// Ques: Take 3 positive integers input and print the greatest of them.
import java.util.*;
public class greatest{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.err.print("Please enter first number : ");
        int a = sc.nextInt();

        System.out.print("Please enter second number : ");
        int b = sc.nextInt();

        System.err.print("Please enter third number : ");
        int c = sc.nextInt();

        if(a > b && a > c){
            System.out.println("A is the greates number");
        }else if(b > a && b > c){
            System.out.print("B is greatest number");
        }else{
            System.out.println("C is greatest number");
        }
    }
}