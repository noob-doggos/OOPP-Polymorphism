package polymorphism2;

public class MovableCircle implements Movable
{ // saved as "MovableCircle.java"
    // instance variables
    private MovablePoint center; // can use center.x, center.y directly
                                 // because they are package accessible
    private int radius;

    // Constructor
    public MovableCircle(int x, int y, int xSpeed, int ySpeed, int radius)
    {
        // Call the MovablePoint's constructor to allocate the center instance.
        this.center = new MovablePoint(x, y, xSpeed, ySpeed);
        this.radius = radius;
    }
    // ......

    // Implement abstract methods declared in the interface Movable
    @Override
    public void moveUp()
    {
        this.center.moveUp();
    }
    
    @Override
    public void moveDown()
    {
        this.center.moveDown();
    }
    
    @Override
    public void moveLeft()
    {
        this.center.moveLeft();
    }
    
    @Override
    public void moveRight()
    {
        this.center.moveRight();
    }
    
    @Override
    public String toString()
    {
        return String.format("MovableCircle[%s,radius=%d]", this.center, this.radius);
    }
    
    // ......
}
