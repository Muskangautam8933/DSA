// Ques: If cost price and selling price of an item is input through the keyboard, write a program to determine whether the seller has made profit or incurred loss or no profit no loss. Also determine how much profit he made or loss he incurred.
import java.util.*;
public class profitAndLoss{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter the selling price : ");
        int sp = sc.nextInt();
        System.out.print("Please enter the cost price : ");
        int cp = sc.nextInt();

        if(sp > cp){
            System.out.print("User get profit");
        }else if(sp == cp ){
            System.out.print("User get no profit and loss");
        }else{
            System.out.println("user get loss");
        }
    }
}