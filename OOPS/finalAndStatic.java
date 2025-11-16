class Cricketer{
    //Final keyword means we can not change the value once it is defined as final
    // final String country = "India";
    static String country  = "india";
    int runs;
    String name;
    double avg;
}

public class finalAndStatic{
    public static void main(String[] args) {
        Cricketer c1 = new Cricketer();
        //print for final
        // c1.country = "england" ;
        // System.out.println(c1.country);
               
        //print for static : sharable variable hota hai sare objects ke sath use kr skte hai usko    
        c1.country = "england" ;
        System.out.println(c1.country);
        
    }
    
}