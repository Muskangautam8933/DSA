// Take 3 positive integers input and print the least of them.

import java.util.*;
public class lowest{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter first number : ");
        int a = sc.nextInt();

        System.out.print("Please enter second number : ");
        int b = sc.nextInt();

        System.out.print("Please enter third number : ");
        int c = sc.nextInt();

        if(a < b && a < c ){
            System.out.println("A is the lowest number");
        }else if(b < a && b < c){
            System.out.println("B is the lowest number");
        }else{
            System.out.println("C is the lowest number");
        }
    }
}