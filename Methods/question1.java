// Ques: Take ‘n’ and ‘r’ as input and print nCr and nPr.
import java.util.*;
public class question1{
    public static int fact(int n , int r){
         double sum = 1;
         for(int i = 1; i<= r ; i++){
            sum = sum*(n - r + i)/i;
         }
         return (int)sum;
    }
    public static void main(String args[]){
        int n = 5;
        int r = 6;

        System.out.println(fact(n,r));
      
    }
}