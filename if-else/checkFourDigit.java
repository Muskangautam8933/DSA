// Ques: Take positive integer input and tell if it is a four digit number or not.
import java.util.*;
public class checkFourDigit{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter any number : ");
        int num = sc.nextInt();

        if(num > 999 && num <  10000){
            System.out.println("Number is four digit number: "+num);
        }else{
            System.out.println("Number is not four digit number");
        }
    }
}