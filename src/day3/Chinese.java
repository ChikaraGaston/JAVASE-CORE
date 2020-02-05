package day3;

/**
 * static关键字的作用
 *
 * ！！！如果想让一个类对应的所有实例化对象都可以共享该数据，可以将其设置为类变量
 * ！！！
 */
public class Chinese {
    //static属于类变量，无需实例化，直接通过以下方式调用，是类的一部分，被类调用，是所有实例化对象的共享
    //其也被称为静态变量
    public static String country;
    public static int count;

    //实例变量，只有实例化后才可以使用，属于实例化对象的一部分
    private int age;
    private int sex;
    private String name;

    public Chinese(){
        //构造一个类计数器
        Chinese.count++;
    }

    public Chinese(int age,int sex,String name){
        this.age=age;
        this.sex=sex;
        this.name=name;
        Chinese.count++;
    }

    //显示该类被调用的次数


    public static void showCount() {
        System.out.println("一共创建了"+Chinese.count+Chinese.country+"人");
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getSex() {
        if (this.sex==0){
            return "woman";
        }else if (this.sex==1){
            return "man";
        }else {
            return "false";
        }

    }

    public void setSex(int sex) {
        this.sex = sex;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void showInfo(){
        System.out.println(Chinese.country);
        System.out.println(this.getAge());
        System.out.println(this.getSex());
        System.out.println(this.getName());
    }


    /**
     * 如静态变量一样，静态方法也可以被类直接访问，写成 类.方法的形式
     * 这种写法一般应用于不需要实例对象参与的调用，简化了电泳方法的复杂度
     * 该方法与调用者无关，是直接由类调用
     *
     * ！！类方法比类属性用的多
     */
    public static void test(){
        System.out.println("无论你是谁，只要是这个类下的人，你都是中国人。");
    }
}
