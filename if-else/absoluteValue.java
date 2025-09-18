// Take integer input and print the absolute value of that integer
import java.util.*;
public class absoluteValue{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter any number :");
        int num = sc.nextInt();

       if(num < 0){
        num  = -num;
       }
       System.out.println("Absolute value is : " + num);


        // if(num >= 0){
        //     System.out.println("Number is Positive : " + num);
        // }else{
        //     System.out.println("Absolute value is : " + (-num));
        // }
    }
}