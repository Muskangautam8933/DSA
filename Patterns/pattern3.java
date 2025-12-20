//                                 *
//                         *       *
//                 *       *       *
//        *        *       *       *
                               
import java.util.Scanner;

public class pattern3{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int st = 1, sp = n-1;

        for(int i = 1; i<= n; i++){
            for(int j = 1; j<= sp; j++){
                System.out.println("\t");
            }

            for(int j = 1; j<= st; j++){
                System.out.println("*\t");
            }
            sp--;
            st++;
            
            System.out.println("\t");
        }
    }
}