package day4.test;

import day4.*;

public class Test3 {
    public static void main(String[] args) {
        BMW b3=new BMWFactory3().productBMW();
        b3.showInfo();
        BMW b5=new BMWFactory5().productBMW();
        b5.showInfo();
        BMW b7=new BMWFactory7().productBMW();
        b7.showInfo();

    }
}
