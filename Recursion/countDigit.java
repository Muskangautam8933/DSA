public class countDigit{
    public static int countNumberOfDigit(int n){
        if(n/10 == 0){
            return 1;
        }

        int smallAns = countNumberOfDigit(n/10);
        return 1+smallAns;
    }
    public static void main(String[] args) {
        System.out.print("Total number of digit present are : "+countNumberOfDigit(123467));
        
    }
}