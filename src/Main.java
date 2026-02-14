public class Main {
    public static  void main(){
        //通过new来创建对象,再通过同类变量接收
        Person p1=null;//这里表示空，无法操作p1
       Person p= new Person();
       Person q= new Person();
        //对象的使用
        p.age=11;
        p.name="肖梦";
        p.sex="妞";

    }
}
