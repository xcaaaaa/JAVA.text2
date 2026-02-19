package come.test;

public class Person {
    //类的定义与对象创建
    String name;
    int age;
    String sex;
    static String info;//静态变量，所有对象共用的
    //方法的创建与使用，相当于c语言中的函数
   public void hello(){
        System.out.println("我叫"+name+"今年"+age+"岁了");
    }
    //让人类做加法运算
   public int Sum(int a,int b){
        return a+b;
    }
 public Person(String name,int age){
        //构造方法,方法名与类名相同，相当于c++中的构造函数,当一个类中有多个构造方法时，可以用this()调用想要的方法，但是只可以调用一次
    //可以进行初始化
}

public static void test(){}
    //静态方法不可一访问对象特有的东西，但可以访问静态变量与c++差不多
}
