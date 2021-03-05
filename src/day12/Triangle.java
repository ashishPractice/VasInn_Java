package day12;

public class Triangle extends Shape{

    public Triangle(){
        System.out.println("Triangle default constructor");
    }

    @Override
    public void draw() {
        System.out.println("Triangle is drawn");
    }
}
