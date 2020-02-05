package day2;

public class Student extends Person{
    private String school;

    public String getSchool() {
        return school;
    }

    public void setSchool(String school) {
        this.school = school;
    }

    public void showInfo(){
        System.out.println(this.school);
        System.out.println(this.sex);
        System.out.println(getAge());
        System.out.println(getName());
    }


}
