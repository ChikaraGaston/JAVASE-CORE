package day0;

/**
 * 计算圆的面积
 *
 */
public class Circle {
    public double area(double r){
            return 3.14*r*r;
    }

    public static void main(String[] args) {
        double area=new Circle().area(5);
        System.out.println(area);
    }
}
