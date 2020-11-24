package polymorphism3;

public class Circle implements GeometricObject
{
    double radius;
    
    public Circle(double radius)
    {
        this.radius = radius;
    }

    @Override
    public double getPerimeter()
    {
        // TODO Auto-generated method stub
        return 2.0 * Math.PI * this.radius;
    }

    @Override
    public double getArea()
    {
        // TODO Auto-generated method stub
        return Math.PI * this.radius * this.radius;
    }
    
    @Override
    public String toString()
    {
        return String.format("Circle[radius=%.5f]", this.radius);
    }
}
