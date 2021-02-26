/*
Encapsulation in Java is a mechanism of wrapping the data (variables) and code acting on the data (methods) together as a single unit
 */

package day8;

public class EncapsulationDemo {
    public static void main(String[] args) {
        Employee emp = new Employee();
        emp.setEmpName("Ram");
        emp.setEmpId(01);
        System.out.println("Name:"+emp.getEmpName());
        System.out.println("Roll:"+emp.getEmpId());
    }
}
