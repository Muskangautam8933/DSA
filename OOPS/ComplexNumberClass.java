class ComplexNumber{
    int x ;
    int y;

    //This is the connsttructor of complexClass
    ComplexNumber(int x , int y) {
        this.x = x;
        this.y = y;
    }
    void print(){
        if(y>=0) System.out.println(x+" + "+y+"i");
        else System.out.println(x+" - "+(-y)+"i");
    }  
}

public class ComplexNumberClass{
    public static void main(String[] args) {
        ComplexNumber z1 = new ComplexNumber(3, 5);
        ComplexNumber z2 = new ComplexNumber(2, -5);
        z1.print();
        z2.print();
        
    }
}
