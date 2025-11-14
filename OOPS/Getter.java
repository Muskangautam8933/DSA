public class Getter{
    String name ;
    int age;
    double cgpa;
    private int rno;

      void print(){
        System.out.println(name + " " + cgpa + " " + age + " " + rno);
      }

      int getRno(){
        return rno;
      }
    public static void main(String[] args) {
         Getter student = new Getter();
         student.name = "Muskan";
         student.age = 20;
         student.cgpa = 8.2;
         student.rno = 87;
         student.print();
         System.out.println(student.getRno());
        
    }
}