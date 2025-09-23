//Count the number of digits
import java.util.*;
public class countDigit{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any number : ");
        int n = sc.nextInt();
        int count = 0;

        while(n != 0 ){
            n = n/10;
            count++;
            
        }
          System.out.println("Total number of digits are : " + count);
    }
}