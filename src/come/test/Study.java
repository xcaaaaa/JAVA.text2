package come.test;
//
public interface Study {
    static  int a=10;
    static void test(){
        System.out.println("我是静态方法");
    }
   default void study(){
       System.out.println("我是默认实现");//通过defaulr关键子可以给接口添加默认实现;
       //接口里可以写静态变量与静态方法，这里的静态变量不可修改
   };//接口用来定义方法
    //接口可以是private;
}
