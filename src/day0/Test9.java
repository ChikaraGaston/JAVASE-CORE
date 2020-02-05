package day0;

public class Test9 {

    public static void swap(DataSwap ds1){
            ds1.a=6;
            System.out.println("swap方法中，ds1.a的值："+ds1.a);
        }

    public static void main(String[] args) {
        DataSwap ds=new DataSwap(1);
        System.out.println("调用swap方法之之前，ds.a的值："+ds.a);
        swap(ds);
        //ds.a=6;
        System.out.println("调用swap方法之后，ds.a的值："+ds.a);
    }

    /**
     * DataSwap ds=new DataSwap()，这一步首先将new DataSwap()这一对象存入堆中
     * 实例化的变量为ds，其存放在栈中，其对应的值为new DataSwap()的内存地址
     * 调用swap()方法，ds1也存在栈中，其对应的值为ds的值，也是new DataSwap()的内存地址
     * 正因为是引用，故两者虽然开辟的不同栈内存空间，但是其指向都是堆中的同一地址
     * 堆中存的才是真正的对象
     *
     */
}
