package day0;

public class TestArray {
    public static void main(String[] args) {
        //创建array1
        int[] array1={2,3,5,7,11,13,17,19};
        for (int i=0;i<array1.length;i++){
            System.out.print(array1[i]+"\t");
        }

        //将array1赋值给array2
        int[] array2=array1;
        //修改array2中的偶索引元素
        for (int i=0;i<array2.length;i+=2){
            array2[i]=i;
        }

        //打印array1
        System.out.println("\narray1:");
        for (int i=0;i<array1.length;i++){
            System.out.print(array1[i]+"\t");
        }

        /**
         * 两者共用同一个内存空间，故修改array2也将array1的值改变了
         */
    }
}
