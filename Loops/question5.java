// Ques: Print the table of any number
import java.util.*;
public class question5{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.err.print("Please enter the any number");
        int n = sc.nextInt();

        for(int i = 1; i <= 10; i++){
            System.out.println(n +" * "+ i + " = " +n*i);
            
        }

    }
}