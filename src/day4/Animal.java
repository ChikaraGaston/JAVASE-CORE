package day4;

public abstract class Animal {
    public abstract void eat();
}
class Cat extends Animal{

    @Override
    public void eat() {
        System.out.println("<・)))><<");
    }

    public void move() {
        System.out.println("跑");
    }
}
