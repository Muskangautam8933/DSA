public class Constructor{
    public class Car{
        int seats;
        String carName;
        double length;

        /*This is how we create constructor constructor name is similar to the class name this is default constructor.
         Car(){
         }
         Parameterized Constrcutor : we give parameter in the method 
         Car(int x , String s, double d){
         }
         */

        Car(int x , String s,double d ){
            seats = x;
            carName = s;
            length = d;
        }
        void print(){
            System.out.println(seats + " " + carName +" "+ length);
        }
    }
    public static void main(String[] args) {
        Constructor c = new Constructor();
        Car c1 = c.new Car(4 , "toyato" , 3.99);
        //This is how wwe can also update 
        c1.length = 9.99;
        c1.print();
        
    }
}