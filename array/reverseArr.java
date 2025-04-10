
import java.util.*;

public class reverseArr {

    public static int reverseArray(int num[]) {
        int first = 0, last = num.length - 1;
        while (first < last) {
            int temp = num[first];
            num[first] = num[last];
            num[last] = temp;

            first++;
            last--;
        }
        return 0;
    }

    public static void main(String args[]) {
        int num[] = {2, 4, 6, 8, 10};
        reverseArray(num);
        for(int i = 0; i< num.length; i++){
            System.out.print(num[i] + " ");
        }
        System.out.println(" ");
    }
}
