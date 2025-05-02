
import java.util.Arrays;

public class thirdLargest{
    public static int thirdLarg(int num[]){
        int n = num.length;

        Arrays.sort(num);
        return num[n-3];
    }
    public static void main(String args[]){
        int num[] = {1,14,2,16,10,20};
        System.out.println(thirdLarg(num));
    }
}