package polymorphism3;

public class TestCircle
{
    public static void main(String[] args)
    {
        Circle circle = new Circle(1.0);
        printCircleInfo(circle);
        circle.radius = 2.0;
        printCircleInfo(circle);
    }
    
    public static void printCircleInfo(Circle circle)
    {
        System.out.println(circle.toString());
        System.out.printf("Circle area=%.6f, perimeter=%.6f\n", circle.getArea(), circle.getPerimeter());
    }
}
