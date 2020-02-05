package day6;

public class A<T> {//此处的泛型T可以随意取名，其代表的是类型，一般使用大写T，意为Type
    private T key;

    public T getKey() {
        return key;
    }

    public void setKey(T key) {
        this.key = key;
    }
}
