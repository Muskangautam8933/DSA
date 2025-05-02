
import java.util.Arrays;

public class secondLargest{
    public static int secLargest(int num[]){
        int n = num.length;
        Arrays.sort(num);
        return num[n - 2];
    }
    public static void main(String args[]){
        int num[] = {12,35,1,10,34,1};
        System.out.println(secLargest(num));
    }
}