package day3.test;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

/**
 * 装箱的操作
 */
public class TestPack {
        public static void main(String[] args) {
                //装箱
                int i=500;
                Integer t=new Integer(i);
                System.out.println(t);


                //拆箱
                int i0=t.intValue();
                System.out.println(i0);

                //布尔类型的拆箱
                Boolean b1=new Boolean(true);
                boolean b2=b1.booleanValue();
                //还可以这样写
                boolean b3=new Boolean(false).booleanValue();

                //包装过程中，也可以填写字符串，但请注意字符串内的实际内容必须为数字，否则会报错
                Integer t1=new Integer("1224");

                /**
                 * java在jdk1.5以后就支持了自动的拆箱装箱，只需类型匹配即可
                 */
                 //Integer t=new Integer(112);
                 //上式可以直接写成
                 Integer t3=112;   //自动装箱

                 int i2=t3;        //自动拆箱
//               int i3=t3.intValue();      //不需要这样写了


                /**
                 * 字符串如何转换为基本数据类型
                 */

                //通过包装类自带的构造器实现
                int j=new Integer("123");
                //用包装类中的自带方法实现  静态方法：parseXxx(String s)
                float f=Float.parseFloat("12.34");
                boolean bb=Boolean.parseBoolean("false");

                /**
                 * 基本数据类型转换为字符串
                 */

                //调用字符串重载的valueOf方法
                String istr=String.valueOf(j);
                String fstr=String.valueOf(f);
                String bstr=String.valueOf(bb);
                //还有更为直观的方法
                String istr1=123+"";


                /**
                 * 包装类主要是用于基本数据类型与字符串之间的 强制类型转换
                 */


        }


}
