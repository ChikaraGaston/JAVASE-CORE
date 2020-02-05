package day7;

import java.io.Serializable;

/**
 * 把对象存储在硬盘中，
 * 首先硬盘的存储基础是以二进制为基础的，
 * 所以就需要先用对象刘将对象转换为二进制的字节流，把这个流保存在电脑上
 *
 * 把这个对象通过网络传到另一个机器上，
 * 也是通过对象流将其转换为二进制的字节流，
 * 通过流的形式在网络中传播，
 * 接受者在接受时再将流转换为对象
 *
 *保存对象到硬盘（对象的持久化）和对象的网络传输，需要做这两件事情，就产生了对象的输入与输出
 *
 * 序列化：将对象写入io流
 * 反序列化：从io流中恢复该java对象
 *
 * 不能序列化static，transient，因为序列化针对的是对象的各种属性，不包括类的属性
 */
public class Person implements Serializable {

    //凡是实现Serializable接口的类都有一个表示序列化版本标识符的静态变量
    //用来表明类的不同版本间的兼容性
    private static final long serialVersionUID = 1L;

    String name;
    int age;
}
