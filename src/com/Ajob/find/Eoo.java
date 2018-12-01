package com.Ajob.find;

/**
 * Created by yixinf-q on 2018/11/24.
 */
public class Eoo {

    public static void main(String[] args) {
        Foo f1 = new Foo();
        f1.show();//运行结果1,1

        Foo f2 = new Foo();
        f2.show();//运行结果1,2。静态变量在方法区，只有一份
    }

}
class Foo{
    int a;
    static int b;
    public  Foo(){
        a++;
        b++;
    }
    void show(){
        System.out.println(a+","+b);
    }
}