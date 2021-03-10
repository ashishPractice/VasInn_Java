package day15;

public class StringDemo8
{
    public static void main(String[] args) {
        System.out.println(isYes("yes")); // true
        System.out.println(isYes("Yes")); // false

        System.out.println(isOkey("okey")); // true
        System.out.println(isOkey("Okey")); // true

        System.out.println(isYesNo("yes")); // true
        System.out.println(isYesNo("no")); // true

        System.out.println(isNumber("123")); // true
        System.out.println(isNumber("abc")); // fasle
        System.out.println(isNumber("1")); // true
        System.out.println(isNumber("1a2b33")); // false

    }

    public static boolean isYes(String s){
        return s.matches("yes");
    }

    public static boolean isOkey(String s){
        return s.matches("[o|O]key");
    }

    public static boolean isYesNo(String s){
        return s.matches("yes|no");
    }

    public static boolean isNumber(String s){
        return s.matches("[0-9]+");
       // or you can do return s.matches("\\d+");

    }

    // Just search of regex for anything like password, email, string length

}
