public class reverseStringBuilder{
    public static void main(String[] args) {
        String str = "Muskan";
        StringBuilder str1 = new StringBuilder(str);
        //1st method to  reverse string
        // str1.reverse();
        // System.out.println(str1);


       //2nd method to  reverse string
        // int i = 0 , j = str1.length()-1;
        // while(i<=j){
        //     char temp1 = str1.charAt(i);
        //     char temp2 = str1.charAt(j);
        //     str1.setCharAt(i, temp2);
        //     str1.setCharAt(j, temp1);
        //     i++;
        //     j--;
        //     System.out.println(str1);

        // }



        //3rd method to  reverse string
        String s = "Gajni";
        StringBuilder sb = new StringBuilder(s);
        sb.reverse();
        s = sb.toString();
        System.out.println(s);

    }
}