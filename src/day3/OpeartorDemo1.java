package day3;

public class OpeartorDemo1 {
    public static void main(String[] args) {
//        1. Arithmetic operator +, - , *, /, %
//        Precedence + - (low) * / % (high)
//        Associativity left to right

        int a = 4 + 5 - 3 * 2 + 4 / 2 - 7 % 3;
        a = 4 + 5 - 6 + 4 / 2 - 7 % 3;
        a = 4 + 5 - 6 + 2 - 7 % 3;
        a = 4 + 5 - 6 + 2 - 1;
        a = 9 - 6 + 2 - 1;
        a = 3 + 2 - 1;
        a = 5 - 1;
        a = 1;
        System.out.println(a);

        System.out.println("=============================");

//        2. Assignment operator =, +=, -=, *=, /=, %=

        int i = 5;
        System.out.println(i);

        i = i + 2;
        System.out.println(i);
        // Is same as above
        i += 2;
        System.out.println();

        System.out.println("=============================");

//        3. Increment decrement operator ++, --
//        pre a++ a--
//        post ++a --a

        int x = 5;
        System.out.println(x); // 5
        x++;
        System.out.println(x); // 6
        ++x;
        System.out.println(x); // 7

        //So what the difference

        x = 5;
        System.out.println(x); // 5
        System.out.println(x++); // 5
        System.out.println(x); // 6

        x = 5;
        System.out.println(x); // 5
        System.out.println(++x); // 6
        System.out.println(x); // 6

        int m = 8;
        int n = m++;
        System.out.println(m); // 9
        System.out.println(n); // 8


        a = 1;
        System.out.println(a++ + ++a + a++ + ++a + a++); //17
        a = 1;
        System.out.println(a++ + ++a + a-- + --a + a++); // 9
        a = 1;
        System.out.println(a++ + a-- + --a + a++); // 3
        a = 1;
        System.out.println(++a + --a); // 3


        // 4. Relational Operator >, <, >=, <=, ==, !=

        a = 4;
        int b = 5;
        System.out.println(a > b); // fasle
        System.out.println(a < b); // true
        System.out.println(a >= b); // false
        System.out.println(a <= b); // true
        System.out.println(a == b); // false
        System.out.println(a != b); // true

        System.out.println("=============================");

        // 5. Logical operator &&(AND), ||(OR), !(NOT)

        System.out.println(true && true); // true
        System.out.println(true && false); // false
        System.out.println(false && true); // false
        System.out.println(false && false); // false

        System.out.println(true || true); // true
        System.out.println(true || false); // true
        System.out.println(false || true); // true
        System.out.println(false || false); // false

        System.out.println(!true); //false
        System.out.println(!false); //true


        System.out.println("=============================");

//        6. ternary operator ?:

        a = 5;
        b = 6;

        if (a > b)
            System.out.println("a is greater than b");
        else
            System.out.println("b is greater than a");

        String max = (a > b) ? "a is greater than b" : "b is greater than a";
        System.out.println(max);

        boolean r = (a > b) ? true : false;
        System.out.println(r);
    }
}
