/*

 **==**
    - для примитивов  - это сравнение по значению
    - для объектов - это сравнение ссылок (не являются ли эти объекты одним и тем же)
    
**equals** сравнивает объекты по значению

 */

public class practice3_0 {
    public static void main(String[] args) {
        String s1 = "hello";
        String s2 = "hello";
        String s3 = s1;
        String s4 = "h" + "e" + "l" + "l" + "o";
        String s5 = new String("hello");
        String s6 = new String(new char[]{'h','e','l','l','o'});

        if (s1 == s2)
            System.out.println("Opearion: s1 == s2 ||| result s1 = s2");
        if (s1 == s3)
            System.out.println("Opearion: s1 == s3 ||| result s1 = s3");
        if (s1 == s4)
            System.out.println("Opearion: s1 == s4 ||| result s1 = s4");

        if (s1 == s5)
            System.out.println("Opearion: s1 == s5 ||| result s1 = s5");
        else
            System.out.println("Opearion: s1 == s5 ||| result s1 != s5");

        if (s1 == s6)
            System.out.println("Opearion: s1 == s6 ||| result s1 = s6");
        else
            System.out.println("Opearion: s1 == s5 ||| result s1 != s6");
            
        System.out.println();


        System.out.println("s1.equals(s2) - " + s1.equals(s2));
        System.out.println("s1.equals(s3) - " + s1.equals(s3));
        System.out.println("s1.equals(s4) - " + s1.equals(s4));
        System.out.println("s1.equals(s5) - " + s1.equals(s5));
        System.out.println("s1.equals(s6) - " + s1.equals(s6));
    }
}
