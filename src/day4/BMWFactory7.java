package day4;

public class BMWFactory7 implements BMWFactory{

    @Override
    public BMW productBMW() {
        System.out.println("生产宝马七系车");
        return new BMW7();
    }


}
