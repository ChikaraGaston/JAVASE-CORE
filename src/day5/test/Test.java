package day5.test;



public class Test {

    /**
     * java.lang.ArrayIndexOutOfBoundsException: 3
     * 数组越界异常
     */

    public static void main(String[] args) {
//        String[] strs=new String[]{"a","b","c"};
//        for (int i=0;i<4;i++){
//            System.out.println(strs[i]);
//        }


        /**
         * java.lang.NullPointerException
         * 没有指向任何对象
         * 空指针异常
         */
//      A a=new A();
//        A a=null;
//        System.out.println(a.i);


//        int i=0;
//        try {//用try{}括住一段有可能出现异常的代码段
//            System.out.println(1);
//            System.out.println(3/i);//此时发生异常，下一句不执行
//            System.out.println(2);
//        }catch (Exception e){//当不知道是什么类型的异常，可以使用所有异常的父类
////                e.printStackTrace();
////                System.out.println(e.getMessage());
//            System.out.println(3);
//        }finally {
//            //这部分可写可不写，最终会执行
//            //IO操作和JDBC会用到
//            System.out.println(4);
//        }
//
//        System.out.println("ok");



        String[] strs=new String[]{"a","b"};
        A a=null;
        /**
         * try catch本身是为了防止程序出现异常而设计的
         * 在捕捉异常的代码块中，如果当前行出现异常，则后续的行不执行
         */
        try{
            System.out.println(strs[2]);
            System.out.println(a.i);
        }

//        catch (ArrayIndexOutOfBoundsException e){
//            System.out.println(e.getStackTrace());
//        }catch (NullPointerException e2){
//            System.out.println(e2.getMessage());
//        }

        catch (Exception e){
            System.out.println(e.getMessage());
            e.printStackTrace();
        }

        System.out.println(12345);

    }
}



class A{
    int i;
}
