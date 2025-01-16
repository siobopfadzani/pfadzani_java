package Exam5.Question2;
interface Drawable
{
    void draw();
}

abstract class Shape implements Drawable
{
    private final String color;
    Shape(String color)
    {
        this.color = color;
    }
    public abstract double getArea();

    public void draw()
    {
        System.out.println("Drawing a "+ color + "shaper");
    }
}

class Circle extends Shape
{
    private final double radius;

    Circle (String color, double radius)
    {
        super(color);
        this.radius = radius;
    }

    public double getArea()
    {
        return Math.PI * radius *radius;
    }
    class CircleDecorator implements Drawable
    {
        public void draw()
        {
            Circle.this.draw();
            System.out.println("Drawing a decorative circle");
        }
    }
}
class Rectangle extends Shape{

    private final double length,width;
    Rectangle(String color, double length, double width)
    {
        super(color);
        this.length = length;
        this.width = width;
    }
    public double getArea()
    {
        return length * width;
    }
    
}
public class main{
    public static void main(String[] args) {
        Shape [] shapes = {new Circle("Red", 5.0),new Rectangle("blue", 4.0, 6.0)};
        for (Shape shape : shapes)
        {
            System.out.println("Area " + shape.getArea());
        }
       
    }
}