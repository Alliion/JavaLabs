package lab1;

public class Ball {
    private String sport;
    private double radius;
    private String colour;

    public Ball(String sport, double radius, String colour){
        this.colour = colour;
        this.sport = sport;
        this.radius = radius;
    }


    public String toString(){
        return "This ball is for " + this.sport + ", radius = " + this.radius + ", color - " + this.colour;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public String getSport() {
        return sport;
    }

    public void setSport(String sport) {
        this.sport = sport;
    }
}
