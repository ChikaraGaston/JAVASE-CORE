package day2;

public class Person {
     String name;
     int age;
     int sex;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getSex() {
        return sex;
    }

    public void setSex(int sex) {
        this.sex = sex;
    }

    public void showInfo(){
        System.out.println(getSex());
        System.out.println(getAge());
        System.out.println(getName());
    }

}
