package day2;

public class Teacher extends Person {
    private String subject;

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public void showInfo(){
        System.out.println(getSubject());
        System.out.println(getSex());
        System.out.println(getAge());
        System.out.println(getName());
    }
}
