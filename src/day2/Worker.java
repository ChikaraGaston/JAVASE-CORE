package day2;

public class Worker extends Person{
    private String profession;

    public String getProfession() {
        return profession;
    }

    public void setProfession(String profession) {
        this.profession = profession;
    }
    public void showInfo(){
        System.out.println(getProfession());
        System.out.println(getSex());
        System.out.println(getAge());
        System.out.println(getName());
    }
}

