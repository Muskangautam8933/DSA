import java.util.*;
public class divideByFive{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter any number :");
        int num = sc.nextInt();
        if(num % 5 == 0){
            System.out.print("Number is divided by 5");
        }else{
            System.out.print("Number is not divided by 5");
        }
    }
}
