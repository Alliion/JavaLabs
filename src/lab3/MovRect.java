package lab3;

public class MovRect implements Movable{
    private MovPoint topLeft;
    private MovPoint bottomRight;

    public MovRect(int x1, int y1, int x2, int y2, int xSpeed, int ySpeed) {
        topLeft = new MovPoint(x1, y1, xSpeed, ySpeed);
        bottomRight = new MovPoint(x2, y2, xSpeed, ySpeed);
    }

    @Override
    public void moveUp() {
        topLeft.y += topLeft.ySpeed;
        bottomRight.y += bottomRight.ySpeed;
    }

    @Override
    public void moveDown() {
        topLeft.y -= topLeft.ySpeed;
        bottomRight.y -= bottomRight.ySpeed;
    }

    @Override
    public void moveLeft() {
        topLeft.x -= topLeft.xSpeed;
        bottomRight.x -= bottomRight.xSpeed;
    }

    @Override
    public void moveRight() {
        topLeft.x += topLeft.xSpeed;
        bottomRight.x += bottomRight.xSpeed;
    }

    @Override
    public String toString() {
        return "Movable Rectangle, topLeft= " + topLeft + ", bottomRight= " + bottomRight;
    }
}