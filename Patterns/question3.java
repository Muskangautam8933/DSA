// Ques: Print the given pattern
// Alphabet Square
// A B C D
// A B C D
// A B C D
// A B C D
import java.util.*;
public class question3{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any number : ");
        int n = sc.nextInt();

        for(int i=1; i <= n ; i++){
            for(int j = 1; j <= n ; j++){
                System.out.print( (char)(j+64) + " ");
            }
            System.out.println();
        }
    }
}