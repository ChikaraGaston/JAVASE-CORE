package day8;

public class Student extends Person implements Move,Study{
    String school;

    public Student(){

    }

    public Student(String school){
        this.school=school;
    }

    private Student(String name,int age){
        this.name=name;
        this.age=age;
    }


    public void showInfo(){
        System.out.println("学习是："+this.school);
    }

    @Override
    public void moveType() {
        System.out.println("学习的是中学知识");
    }

    @Override
    public void studyInfo() {
        System.out.println("骑自行车上学");
    }
}
