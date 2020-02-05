package day2.test;

import day2.Circle;
import day2.Cylinder;

public class TestCliender {
    public static void main(String[] args) {
//        Circle c=new Circle(4);
        Cylinder cy=new Cylinder(4,1);
        cy.setRadius(4);
        cy.setHeight(1);
        System.out.println(cy.getHeight());
        System.out.println(cy.findVolume());
//        System.out.println(c.findArea());
    }
}
