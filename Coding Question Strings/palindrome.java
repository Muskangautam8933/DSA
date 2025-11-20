public class palindrome{
    public static boolean isPalindrome(String str){
       str =  str.toLowerCase();
       String rev  = "";

       for(int i = str.length()-1; i >= 0; i--){
        rev = rev + str.charAt(i);
       }
       return str.equals(rev);
    }
    public static void main(String[] args) {
        String str = "level";
        boolean res = isPalindrome(str);
        if(res){
            System.out.println("String is palindrome");
        }else{
            System.out.println("String is not palindrome");
        }


        
    }
}