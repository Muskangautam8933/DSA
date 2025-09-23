// Ques: Print all alphabets with their corresponding ASCII values.
public class alphabet{
    public static void main(String[] args) {
       
        // for(char c = 'A'; c <= 'Z' ; c++){
        //     System.out.print(c +" :" + c);
        // }

        for(int i = 65;i <= 90 ; i++){
            System.out.println((char)i + " = " + i);
        }
    }
}