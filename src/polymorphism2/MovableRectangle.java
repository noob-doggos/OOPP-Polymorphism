package polymorphism2;

public class MovableRectangle implements Movable
{
    MovablePoint topLeft;
    MovablePoint bottomRight;
    
    public MovableRectangle(int x1, int y1, int x2, int y2, int xSpeed, int ySpeed)
    {
        this.topLeft = new MovablePoint(x1, y1, xSpeed, ySpeed);
        this.bottomRight = new MovablePoint(x2, y2, xSpeed, ySpeed);
    }
    
    @Override
    public String toString()
    {
        return String.format("MovableRectangle[topLeft=%s,bottomRight=%s]", this.topLeft, this.bottomRight);
    }

    @Override
    public void moveUp()
    {
        // TODO Auto-generated method stub
        this.topLeft.moveUp();
        this.bottomRight.moveUp();
    }

    @Override
    public void moveDown()
    {
        // TODO Auto-generated method stub
        this.topLeft.moveDown();
        this.bottomRight.moveDown();
    }

    @Override
    public void moveLeft()
    {
        // TODO Auto-generated method stub
        this.topLeft.moveLeft();
        this.bottomRight.moveLeft();
    }

    @Override
    public void moveRight()
    {
        // TODO Auto-generated method stub
        this.topLeft.moveRight();
        this.bottomRight.moveRight();
    }

}
