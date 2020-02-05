package day0;

public class Test4 {
    public static void main(String[] args) {

        Student1 s1 = new Student1("小张");
        Student1 s2 = new Student1("小李");
        Test4.swap(s1,s2);
        System.out.println("s1:" + s1.getName());
        System.out.println("s2:" + s2.getName());
    }

    public static void swap(Student1 x, Student1 y) {
        Student1 temp = x;
        x = y;
        y = temp;
        System.out.println("x:" + x.getName());
        System.out.println("y:" + y.getName());
    }
}
class Student1{
    private String name;

    public Student1(){

    }
    public Student1(String name){
        this.name=name;
    }

    public String getName(){
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
