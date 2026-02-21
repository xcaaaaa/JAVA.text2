package come.test;

public class Main {
    public static  void main(){
        //通过new来创建对象,再通过同类变量接收
        Person p1=null;//这里表示空，无法操作p1
        Student p=new Student();
        Student q=new Student();
        //对象的使用
        p.age=11;
        p.name="肖梦";
        p.sex="妞";
        p.hello();
       int s= p.Sum(3,4);
       System.out.println(s);
       q.hello();
        Student w= new Student();
        //instanceof关键字可以判断变量的类型,p instanceof Person;判断p是否Person类型
    }
    Anilm p=Anilm.newInstance();//构造对象
}

//包的声名与导入，将类放到包里，不在一个包里的类要进行导入才可以使用通过import关键字导入
//不同包里的类即使类名相同也是不同类,但是同名类引用到一个包里要手动补全包名
//类的继承中父类会默认继承object类，object类是最顶层类