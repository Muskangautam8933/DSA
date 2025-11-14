public class classesObject{
    public static class Students{
        //in the class we deine our data type and classes are the blueprint or template of objects
      String stuName;
      int stuAge;
      String stuGender;
      int stuNumbers;
    }
    public static void main(String[] args) {
        // object are the real world entity of class
        Students s1 = new Students();
        s1.stuName = "Muskan";
        s1.stuAge = 20;
        s1.stuGender = "Female";
        s1.stuNumbers = 80;

        Students s2 = new Students();
         s2.stuName = "Dev";
         s2.stuAge = 20;
         s2.stuGender = "Male";
         s2.stuNumbers = 90;


        System.out.println("first student name is : " + s1.stuName);
        System.out.println("second student name is : " + s2.stuName);

        System.out.println("first student age is : " + s1.stuAge);
        System.out.println("second student age is : " + s2.stuAge);

        System.out.println("first student gender is : " + s1.stuGender);
        System.out.println("second student gender is : " + s2.stuGender);

        System.out.println("first student number is : " + s1.stuNumbers);
        System.out.println("second student number is : " + s2.stuNumbers);
    }
}