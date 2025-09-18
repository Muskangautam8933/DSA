
import java.util.Scanner;
public class question{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Please enter any number : ");
        int num = sc.nextInt();

        if(num % 5 == 0 && num % 3 == 0){
            System.out.print("Number is divided by both : " + num);
        }else if(num % 5 == 0){
            System.out.print("Number is divided by only 5 : "+ num);
        }else if(num % 3 == 0){
            System.out.print("Number is divided by only 3 : " + num);
        }else{
            System.out.print("Number is not divided by both");
        }
    }
}