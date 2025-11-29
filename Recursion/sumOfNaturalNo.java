
import java.util.Scanner;

public class sumOfNaturalNo{
    public static int son(int n){
        if(n==0){
            return 0;
        }

        int smallAns = son(n-1);
        return smallAns+n;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter any num : ");
        int n = sc.nextInt();
        System.out.print(son(n));
    }
}