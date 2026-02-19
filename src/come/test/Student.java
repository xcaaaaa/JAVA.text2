package come.test;

public final class  Student extends Person{
    public void Learn(){
        System.out.println("学习");
    }
    public Student(){
        super("小明",18);
    }
}
//类的继承，final关键字可以将一个变量变成常量，final int a=10;此时a不可以修改，final还可以在继承中表示最后继承的，如上面的，此时Student不可以在被继承
//如果父类中有有参构造方法,子类继承时要重写构造方法父类用super，如上