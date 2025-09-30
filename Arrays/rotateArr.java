import java.util.Arrays;
public class rotateArr{
    public static void main(String[] args) {
        int arr[] = {3,5,6,7,9,0,4,1};
        int d = 3;
        int n = arr.length;

        int temp[] = new int[n];

        for(int i = 0; i< n; i++){
            temp[i] = arr[(i + d)%n];
        }
        System.out.println("Left rotate arr: "+Arrays.toString(temp));
    }
}