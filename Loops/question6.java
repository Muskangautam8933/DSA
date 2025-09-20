// Ques: Print numbers from ‘n’ to 1
import java.util.*;
public class question6{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter the range in which you want number in decreasing order");
        int n = sc.nextInt();

        for(int i = n; i >= 0; i--){
            System.out.print(i +" ");
        }


    }
}