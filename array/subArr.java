import java.util.*;
public class subArr{
    public static int getSubArr(int num[]){
        for(int i = 0; i < num.length; i++){
            int start = i;
          
            for(int j = i + 1; j < num.length ; j++){
                int end = j;
                for(int k = start; k <= end; k++){
                    System.out.print(num[k]+ " ");
                }
                System.out.println();
            }
            System.out.println();
        }
        return 0;
    }
    public static void main(String args[]){
        int num[] = {2,4,6,8,10,12};
        getSubArr(num);
    }
}