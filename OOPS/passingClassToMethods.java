public class passingClassToMethods{
    public static class Car{
        int seats;
        String carName;
        double length;
        String type;
        int torque;

        void printDetails() {
           System.out.println(seats + " " + carName + " " + length + " " + type + " " + torque);
        }
    }
    public static void main(String[] args) {
        Car c = new Car();
        c.carName = "Toyato";
        c.seats = 5;
        c.length = 3.99;
        c.type = "SUV";
        c.torque = 178;
     
        c.printDetails();
        change(c);
        System.out.println(c.seats);
        
    }

    public static void change(Car c){
        c.seats = 4;
    }
}