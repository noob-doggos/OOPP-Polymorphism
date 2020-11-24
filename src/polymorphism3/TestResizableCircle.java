package polymorphism3;

public class TestResizableCircle
{
    public static void main(String[] args)
    {
        Circle circle = new ResizableCircle(1.0);
        TestCircle.printCircleInfo(circle);
        circle.radius = 2.0;
        TestCircle.printCircleInfo(circle);
        ResizableCircle rCircle = (ResizableCircle) circle;
        rCircle.resize(50);
        TestCircle.printCircleInfo(rCircle);
        rCircle.resize(400);
        TestCircle.printCircleInfo(rCircle);
    }
}
