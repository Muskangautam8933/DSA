public class reverse{
    public static void main(String[] args) {
        String str = "Muskan";
        String rev = "";

        for(int i = str.length()-1 ; i >= 0; i--){
            rev = rev + str.charAt(i);
        }

        System.out.println("Rverse string is : "+ rev);
    }
}