// HW: Print this series - 99,95,91,87,.. upto all terms which are positive
import java.util.*;
public class question7{
    public static void main(String[] args){
        // for(int i = 99 ; i > 0 ; i = i - 4){
        //     System.out.print(i + " ");
        // }
        int a = 99;      // first term
        int d = -4;      // common difference

        for (int i = a; i > 0; i += d) {
            System.out.print(i + " ");
        }
    }
}