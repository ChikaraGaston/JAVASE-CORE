package day2;

public class Kid extends Mankind {
    int yearsOld;
    public void printAge(){
        System.out.println(this.yearsOld);
    }

    public int getYearsOld() {
        return yearsOld;
    }

    public void setYearsOld(int yearsOld) {
        this.yearsOld = yearsOld;
    }

    public static void main(String[] args) {
        Kid someKid=new Kid();
        someKid.setSalary(100);
        someKid.setSex(0);

        someKid.manOrWoman();
        someKid.employeed();
        someKid.printAge();
    }
}
