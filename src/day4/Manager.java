package day4;

public class Manager extends Employee{
    double bouns;

    public void setManager(int id,String name,double salary,double bouns){
        super.id=id;
        super.name=name;
        super.salary=salary;

        this.bouns=bouns;
    }

    public void getCommonEmployee(){
        System.out.println(id);
        System.out.println(name);
        System.out.println(salary);
        System.out.println(bouns);
    }

    @Override
    public void work() {
        System.out.println("这是一个经理在工作");
    }
}
