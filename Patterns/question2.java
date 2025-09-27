// Ques: Print the given pattern
// Number Square
// 1 2 3 4
// 1 2 3 4
// 1 2 3 4
// 1 2 3 4

import java.util.*;
public class question2{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
         
         int n = sc.nextInt();

         for(int i = 1 ; i<= n; i++){
            for(int j = 1 ; j<= n ; j++){
                System.out.print(j + " ");
            }
            System.out.println();
         }

    }
}