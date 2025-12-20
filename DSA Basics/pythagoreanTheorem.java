
import java.util.Scanner;

public class pythagoreanTheorem{
   public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       System.out.print("First number : ");
       int a = sc.nextInt();
       System.out.print("second number : ");
       int b = sc.nextInt();
       System.out.print("third number : ");
       int c = sc.nextInt();

       int max = a;
       if(b >=  max){
        max = b;
       }

       if(c > max){
        max = c; 
       }

       if( max == a){
          boolean flag = ((b*b + c*c) == (a*a));
          System.out.println(flag);
       }else if(max == b){
          boolean flag = ((a*a + c*c) == (b*b));
          System.out.println(flag);
       }else{
          boolean flag = ((b*b + a*a) == (c*c));
          System.out.println(flag);
       }
   }
}