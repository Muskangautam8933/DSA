public class stringBuilder{
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Muskan");
        System.out.println(sb.length() + " "+ sb.capacity());
        System.out.println(sb); 
        sb.append(" Gautam");
        System.out.println(sb);

        sb.setCharAt(1 , 'o');
        System.out.println(sb);

        String t = sb.toString();
        System.out.println(t);

        StringBuilder s =  new StringBuilder("Morning");
        s.delete(1 , 3);
        System.out.println(s);

        StringBuilder s1 =  new StringBuilder("Morning");
        s1.insert(2, 'r');
        System.out.println(s1);

    }
}