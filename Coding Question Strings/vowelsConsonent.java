public class vowelsConsonent{
   public static void main(String[] args) {
       String str = "Helllo Worlds";
       str = str.toLowerCase();
       int countVowel = 0;
       int countConsonent = 0;

       for(int i = 0; i< str.length(); i++){
          char ch = str.charAt(i);
          if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'){
            countVowel++;
          }else if (ch >= 'a' && ch <= 'z') {
              countConsonent++;
          }
       }
       System.out.println("Total vowels : "+ countVowel);
       System.out.println("Total consonent : "+countConsonent);
   }
}