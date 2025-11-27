import java.util.*;
public class squarePattern{
    public static int sqare(int n){
        Scanner sc = new Scanner(System.in);
        // int n = sc.nextInt();
        for(int i = 0; i< n; i++){
            for(int j = 0; j < n; j++){
                System.out.println("*");
            }
            System.out.println();
        }
        return 0;
    }
    public static void main(String args[]){
        sqare(5);
    }
}