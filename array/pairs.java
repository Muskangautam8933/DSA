import java.util.*;
public class pairs{
    public static int getPairs(int num[]){
        for(int i = 0; i < num.length; i++){
            int curr = num[i];
            for(int j = i + 1; j < num.length; j++){
                System.out.println("(" + curr + "," + num[j]+ ")");
            }
            System.out.println();
        }
        return 0;
    }
    public static void main(String args[]){
        int num[] = {2,4,6,8,10};
        getPairs(num);
    }
}