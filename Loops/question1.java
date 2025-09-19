//  Ques: Print _________ ‘n’ times. Take ‘n’ input from user
import java.util.*;
public class question1{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter the times in which you want to print yashika : ");
        int num = sc.nextInt();

        for(int i = 1 ; i<= num ; i++){
          System.out.println("Yashika");
        }
    }
}