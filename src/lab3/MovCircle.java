package lab3;

public class MovCircle implements Movable{
    private int radius;
    private MovPoint center;

    public MovCircle(int x, int y, int xSpeed, int ySpeed, int radius) {
        this.radius = radius;
        this.center = new MovPoint(x, y, xSpeed, ySpeed);
    }

    @Override
    public String toString() {
        return "Movable Circle, radius= " + radius + ", center= " + center;
    }

    @Override
    public void moveUp() {
        center.y += center.ySpeed;
    }

    @Override
    public void moveDown() {
        center.y -= center.ySpeed;
    }

    @Override
    public void moveLeft() {
        center.x -= center.xSpeed;
    }

    @Override
    public void moveRight() {
        center.x += center.xSpeed;
    }
}
