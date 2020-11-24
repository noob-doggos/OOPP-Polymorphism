package polymorphism2;

public class MovablePoint implements Movable
{ // saved as "MovablePoint.java"
  // instance variables
    int x, y, xSpeed, ySpeed; // package access

    // Constructor
    public MovablePoint(int x, int y, int xSpeed, int ySpeed)
    {
        this.x = x;
        this.y = y;
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    // Implement abstract methods declared in the interface Movable
    @Override
    public void moveUp()
    {
        this.y -= this.ySpeed; // y-axis pointing down for 2D graphics
    }

    @Override
    public void moveDown()
    {
        this.y += this.ySpeed;
    }

    @Override
    public void moveLeft()
    {
        this.x -= this.xSpeed;
    }

    @Override
    public void moveRight()
    {
        this.x += this.xSpeed;
    }

    @Override
    public String toString()
    {
        return String.format("MovablePoint[x=%d,y=%d,xSpeed=%d,ySpeed=%d]", this.x, this.y, this.xSpeed,
            this.ySpeed);
    }
}