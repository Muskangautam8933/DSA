
import java.util.Scanner;

public class stringBasics{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your string : ");
        //nextLine print the complete line of the sentence 
        String str = sc.nextLine();
        System.out.print(str);

        System.out.print("Enter your second string : ");
        //nextLine print only single word it break after any single space. 
        String str1 = sc.next();
        System.out.print(str1);
    }
}