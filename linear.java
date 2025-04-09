import java.util.*;

public class linear {

    public static int linearSearch(int arr[], int key) { // Added 'int' return type
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == key) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String args[]) {
        int arr[] = {2, 4, 6, 8, 10, 12};
        int key = 8;
        int index = linearSearch(arr, key);
        
        if (index == -1) {
            System.out.println("Key is not found");
        } else {
            System.out.println("Key is at index: " + index);
        }
    }
}
