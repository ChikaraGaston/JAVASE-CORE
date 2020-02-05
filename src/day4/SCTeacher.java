package day4;

/**
 * 描述会唱歌会做饭的老师
 */
public class SCTeacher extends Person1 implements Cooking,Singing{
    String course;

    public void setInfo() {
        super.name="fgcg";
        super.age=11;
        super.sex=1;

        this.course = "数学";
    }

    @Override
    public void fry() {
        System.out.println(super.name+"老师会炒菜");
    }

    @Override
    public void showInfo() {
        System.out.println("会唱歌会做饭的老师信息：");
        System.out.println(super.name);
        System.out.println(super.age);
        System.out.println(super.sex);
        System.out.println(this.course);
    }

    @Override
    public void singiung() {
        System.out.println(super.name+"老师会唱歌");

    }
}
