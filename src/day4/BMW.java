package day4;

public interface BMW {
    //产品信息
    //车的发动方式
void showInfo();
}

/**
 * 构建具体的类
 */

class BMW3i implements BMW{
    @Override
    public void showInfo() {
        System.out.println("这是三系车");
        System.out.println("改造三系车，使其变成BMW3i");
    }
}

class BMW5 implements BMW{
    @Override
    public void showInfo() {
        System.out.println("这是五系车");
    }
}

class BMW7 implements BMW{
    @Override
    public void showInfo() {
        System.out.println("这是七系车");
    }
}

