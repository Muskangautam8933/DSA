// Ques: Take 3 positive integers input and tell if they can be the sides of a triangle or not.
import java.util.*;
public class tringleSide{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter first side of tringle : ");
        int a = sc.nextInt();

        System.err.print("Please enter second side of tringle : ");
        int b = sc.nextInt();

        System.err.print("Please enter third side of tringle : ");
        int c = sc.nextInt();

        if(a+b > c && b+c > a && c+a > b){
            System.out.println("These are the side of tringle");
        }else{
            System.out.println("These are not side of tringle");
        }
    }
}