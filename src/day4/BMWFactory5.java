package day4;

public class BMWFactory5 implements BMWFactory{

    @Override
    public BMW productBMW() {
        System.out.println("生产宝马五系车");
        return new BMW5();
    }


}
