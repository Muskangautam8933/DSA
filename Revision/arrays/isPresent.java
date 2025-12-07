
import java.util.Scanner;

//check if number is present in array or not

public class isPresent{
    public static void PresentOrNot(int arr[], int x){
        int n = arr.length;
        boolean found =  false;

        for(int i = 0; i< n; i++){
            if(arr[i] == x){
                found = true;
                break;
            }
        }

        if(found){
            System.out.println("Element is present in array  ");
        }else{
            System.out.println("Element is not present in array  ");
        }
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int arr[] = {5,3,2,7,8,0,1,4};
        System.out.print("Enter the number you want to check : ");
        int x = sc.nextInt();
        PresentOrNot(arr, x);
        
    }
}