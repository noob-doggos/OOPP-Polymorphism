package polymorphism3;

public class ResizableCircle extends Circle implements Resizable
{
    public ResizableCircle(double radius)
    {
        super(radius);
        // TODO Auto-generated constructor stub
    }

    @Override
    public void resize(int percent)
    {
        // TODO Auto-generated method stub
        super.radius *= percent / 100.0;
    }

}
