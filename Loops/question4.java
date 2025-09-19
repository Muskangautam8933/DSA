// HW: Print all odd numbers divisible by 3 from 1 to 100
import java.util.*;
public class question4{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        

        for(int i = 1 ; i<= 100; i++){
            if(i % 3 == 0){
          System.out.print(i + " ");
            }
        }
    }
}