import java.util.*;
public class evenNumber{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.print("Please enter any number: ");
        int num = sc.nextInt();
        if(num % 2 == 0){
            System.out.println("Number is even");
        }else{
            System.out.println("Number is odd");
        }
    }
}