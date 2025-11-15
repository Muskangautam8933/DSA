public class SETTER{

    //In setter 
    public class Students{
        String name;
        private int Rno;
        int age;
        String gender;

        void print(){
            System.out.print(name + " " + Rno + " "+ age + " " + gender);
        }
        
        int getRno(){
            return Rno;
        }
        void setRno(int x){
            Rno = x;
        }

    }
    public static void main(String args[]){
        SETTER outer = new SETTER();   // Create outer class object
        Students s = outer.new Students();  //Create inner class object
        s.name = "Muskan";
        s.Rno = 87;
        s.age = 20;
        s.gender = "female";
        
        s.setRno(45);
        s.print();
    }
}