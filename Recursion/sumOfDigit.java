

public class sumOfDigit{
    public static int sod(int n){
        //base case
        if(n >= 0 && n <= 9){
            return n;
        }
        //recursive condition
        int smallAns = sod(n/10);
        //self work
        return smallAns + n%10;
    }
    public static void main(String[] args) {
        System.out.println("sum of the digits are : "+sod(1234));
    }
}