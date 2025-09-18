// Ques: Take real number input and check if it is an integer or not.
import java.util.*;
public class checkInteger{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.print("Please enter any number : ");
        double num = sc.nextDouble();  //n = 3.1415
        int x  = (int)num; // 3

        if(num - x > 0){
            System.out.println("Number is not Integer"); 
        }else{
            System.out.println("Number is Integer");
        }
    }
}