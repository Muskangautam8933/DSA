public class pow{
    public static int power(int p,int q){
        if(q==0){
            return 1;
        }

        int smallAns = power(p, q-1);
        return smallAns * p;
    }
    public static void main(String[] args) {
        System.out.print(power(2, 5));
        
    }
}