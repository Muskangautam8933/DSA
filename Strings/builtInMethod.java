public class builtInMethod{
    public static void main(String[] args) {
        String str = "Muskan Gautam";
        System.out.println(str.indexOf('a'));


        String str1 = "Muskan Gautam";
        System.out.println(str1.lastIndexOf('a'));

        String str2 = "Muskan Gautam";
        System.out.println(str2.toLowerCase());

        String str3 = "Muskan Gautam";
        System.out.println(str3.toUpperCase());

        String a = "Harshita";
        String b = "Namrita";
        System.out.println(a.compareTo(b));

        
        String c = "Harshita";
        String d = "Namrita";
        System.out.println(a.concat(b));

        String e = "Harshita";
        e = e + " is a good girl";
        e = e + 10;
        e = e + '\n';
        e = e + 'n';
        System.out.println(e);

        System.out.println("kritika"+10+20);
        System.out.println(10+"kritika"+20);
        System.out.println(10+20+"kritika");
        System.out.println('A'+10 +"kritika");
        System.out.println("kritika"+(10+20));
        
    }
}