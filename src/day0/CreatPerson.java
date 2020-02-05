package day0;

public class CreatPerson {
    public static void main(String[] args) {
        //实例化Person类
        Person person=new Person();//声明Person变量，new 将其实例化
        person.name="张三";
        person.age=53;

        person.showName();
        int i=person.getAge();
        System.out.println(i);
    }
}
