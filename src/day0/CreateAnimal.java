package day0;

public class CreateAnimal {
    public static void main(String[] args) {
        Animal ani=new Animal();
        ani.legs=4;
        ani.name="猫";

        String name =ani.getName();
        int i=ani.showLegs();


        System.out.println(name+"有"+i+"条腿");
        ani.move("奔跑");
        ani.eat("老鼠");


    }
}
