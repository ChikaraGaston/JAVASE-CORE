package day4.test;

public class Test6 {
    public static void main(String[] args) {
        new D().testZ();
    }
}

/**
 * 倘若类D想要同时获得类E类F的方法，并且将其重写，需要使用内部类
 * 如下所示，内部类可以变相的完成多重继承，重写并使用多个方法
 */
class D{

        public void testZ(){
            new InnerE().testE();
            new InnerF().testF();
        }
        private class InnerE extends E{
            @Override
            public void testE() {
                System.out.println("重写了testE方法");
            }
        }

        private class InnerF extends F{
        @Override
        public void testF() {
            System.out.println("重写了testF方法");
              }
        }
}

class E{
    public void testE(){
        System.out.println("本来的testE方法");
    }
}

class F{
    public void testF(){
        System.out.println("本来的testF方法");
    }
}