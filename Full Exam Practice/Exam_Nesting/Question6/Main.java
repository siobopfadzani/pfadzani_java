package Exam_Nesting.Question6;
class Shape
{
    public void draw()
    {
        System.out.println("Drawing a shape");
    }
}
class Circle extends Shape
{
    public void draw()
    {
        System.out.println("Drawing a circle");
    }
}
public class Main {
    public static void main(String[] args) {
        Shape []shapes = new Shape[2];
        shapes[0] = new Circle();
        shapes[1] = new Shape();
        for(Shape shape : shapes)
        {
            shape.draw();
        }
    }
    
}
