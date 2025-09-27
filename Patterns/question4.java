// HW: Print the given pattern

// Alphabet Square 2
// a b c d
// a b c d
// a b c d
// a b c d
import java.util.*;
public class question4{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any number : ");
        int n = sc.nextInt();

        for(int i=1; i <= n ; i++){
            for(int j = 1; j <= n ; j++){
                System.out.print( (char)(j+96) + " ");
            }
            System.out.println();
        }
    }
}