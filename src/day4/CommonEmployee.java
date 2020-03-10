package day4;

public class CommonEmployee extends Employee{
    public void setCommonEmployee(int id,String name,double salary) {
        super.id=id;
        super.name=name;
        super.salary=salary;
    }

    public void getCommonEmployee(){
        System.out.println(id);
        System.out.println(name);
        System.out.println(salary);
    }

    @Override
    public void work() {
        System.out.println("这是一个普通员工在996");
    }
}
