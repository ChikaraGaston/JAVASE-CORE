package day2;

public class Circle {
    private double radius;

    public Circle(){

    }
    public Circle(double radius){
        this.radius=radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
    public double findArea(){
        return 3.14*radius*radius;
    }
}
