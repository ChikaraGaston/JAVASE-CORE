package day6.test;

public class TestEnum {
    public static void main(String[] args) {
        Season spring=Season.SPRING;
        Season summer=Season.SUMMER;
        Season autumn=Season.AUTUMN;
        Season winter=Season.WINTER;
        spring.showInfo();
        spring.test();
    }
}


//枚举类
enum Season implements Itest{

    //这种写法其实是在调用构造方法private  Season(String name,String desc)
    SPRING("春天","春暖花开"),
    SUMMER("夏天","炎炎烈日"),
    AUTUMN("秋天","秋高气爽"),
    WINTER("冬天","寒风凌冽");

    private final String name;
    private final String desc;

    private Season(String name,String desc){
        this.name=name;
        this.desc=desc;
    }

    public void showInfo(){
        System.out.println(this.name+"："+this.desc);
    }

    @Override
    public void test() {
        System.out.println("实现了test方法");
    }
}

interface Itest{
    void test();
}