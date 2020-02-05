package day6.test;

import java.sql.SQLOutput;

public class Test1 {
    public static void main(String[] args) {
//        B1<Object> b1=new B1<Object>();
//        B2 b2=new B2();

        C<Object> c=new C<Object>();
        c.test("sdasdsadas");
        /**
         * 泛型方法在调用之前没有固定的数据类型
         * 在调用的时候，传入的参数是什么类型，就会把泛型变成什么类型
         */
        c.test1(2);
        c.test1(true);
    }
}

interface IB<T>{
    T test(T t);
}

//未传入实参，与泛型类的定义相同，在声明类的时候，需要泛型的声明也一起加到类中
class B1<T> implements IB<T>{

    @Override
    public T test(T t) {
        return t;
    }
}


//在实现类实现泛型接口时，如已将泛型类型传入实参类型，则所有使用泛型的地方都要替换成传入的实参类型
class B2 implements IB<String>{


    @Override
    public String test(String s) {
        return null;
    }
}

class C<E>{
    private E e;

    public static<T> void test3(T t){
//        //在静态方法中，不能使用类中自定义的泛型，如果使用泛型，只能用静态方法自己定义的泛型
//        System.out.println(this.e);
        System.out.println(t);
    }

    //无返回值的泛型方法
    public<T> void test(T s){
        //在类上定义的泛型可以在普通方法中调用
        System.out.println(this.e);
        T t=s;
    }

    //有返回值的泛型方法
    public<T> T test1(T s){
        return s;
    }

    //形参为可变参数的泛型方法
    public<T> void test2(T...strs){
        for(T s:strs){
            System.out.println(s);
        }
    }
}