// How to create mutuable object

package day15;

public class StringBuilderDemo {

    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Good");
        System.out.println(sb);

        sb.append(" morining");
        System.out.println(sb);

        sb.insert(0,"Hello ");
        System.out.println(sb);

        sb.delete(6,11);
        System.out.println(sb);

        sb.reverse();
        System.out.println(sb);


    }
}
