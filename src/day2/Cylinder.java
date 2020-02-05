package day2;

public class Cylinder extends Circle{
    private double height;

    public Cylinder(double radius,double height){
        super(radius);
        this.height=height;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double findVolume(){
        return super.findArea()*height;
    }

    public void showHeight(){
        System.out.println(getHeight());
    }
}
