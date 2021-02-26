/*
Constructor overloading Example
    1. Number of argument
    2. Type of argument
    3. Sequence of argument
 */

package day8;

public class User {
    String name;
    int age;

    public User(){
        System.out.println("Default constructor");
    }

    // Sequence of argument
    public User(String n, int a){
        name = n;
        age = a;
        System.out.println("Parameterized Constructor with two param");
    }

    public User( int a, String n){
        name = n;
        age = a;
        System.out.println("Parameterized Constructor with two param");
    }

    public User(String n){
        name = n;
        System.out.println("Parameterized Constructor with string param");
    }

    public User(int a){
        age = a;
        System.out.println("Parameterized Constructor with int param");
    }


    public static void main(String[] args) {
        User user1 = new User();
        User user2 = new User("Ram",22);
    }
}
