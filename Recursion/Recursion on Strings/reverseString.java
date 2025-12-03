
import java.util.Scanner;

public class reverseString{
    public static  String reverse(String s , int idx){
        if(idx == s.length()){
             return " ";
        }

        String smallAns = reverse(s, idx+1);
        return smallAns + s.charAt(idx);
    }
   public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       System.out.print("Enter any string : ");
       String s = sc.nextLine();
       System.out.print(reverse(s, 0));
   }
}