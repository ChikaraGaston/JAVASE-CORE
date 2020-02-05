package day4;

public class BMWFactory3 implements BMWFactory{

    @Override
    public BMW productBMW() {
        System.out.println("生产宝马三系车");
        System.out.println("改造三系车，使其变成BMW3i");
        return new BMW3i();
    }
}
