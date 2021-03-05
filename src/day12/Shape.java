package day12;

public abstract class Shape {

   public Shape(){
      System.out.println("Shape default constructor");
   }

   public abstract void draw();

   public void paint(){
      System.out.println("Paint from parent");
   }

}
