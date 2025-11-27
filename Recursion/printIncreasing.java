
import java.util.Scanner;

public class printIncreasing{

    static void pI(int n){
        //Base condition
        if(n==1){
            System.out.print(n);
            return;
        }
        //Recursive condition 
        pI(n-1);
        //Self work
        System.out.print(n + " ");

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any number you want to print upto : ");
        int n = sc.nextInt();
        pI( n);
    }
}