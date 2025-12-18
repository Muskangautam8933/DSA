
import java.util.Scanner;

public class fibonacci{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter num : ");
        int n = sc.nextInt();

        int prev = 0, secPrev= 1;

        for(int i = 1; i< n;i++){
            System.out.print(prev+ " ");
            int next = prev + secPrev;
            secPrev = prev;
            prev = next;
        }
    }
}