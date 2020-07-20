package cn.xinghaibay.principle.segregation;

public class Segregation1 {

    public static void main(String[] args) {

    }
}

interface Interface1{
    void operation1();
    void operation2();
    void operation3();
    void operation4();
    void operation5();
}

class B implements cn.xinghaibay.principle.segregation.improve.Interface1 {

    @Override
    public void operation1() {
        System.out.println("class B 实现了 operation1");
    }

    @Override
    public void operation2() {
        System.out.println("class B 实现了 operation2");
    }

    @Override
    public void operation3() {
        System.out.println("class B 实现了 operation3");
    }

    @Override
    public void operation4() {
        System.out.println("class B 实现了 operation4");
    }

    @Override
    public void operation5() {
        System.out.println("class B 实现了 operation5");
    }
}

class D implements cn.xinghaibay.principle.segregation.improve.Interface1 {

    @Override
    public void operation1() {
        System.out.println("class D 实现了 operation1");
    }

    @Override
    public void operation2() {
        System.out.println("class D 实现了 operation2");
    }

    @Override
    public void operation3() {
        System.out.println("class D 实现了 operation3");
    }

    @Override
    public void operation4() {
        System.out.println("class D 实现了 operation4");
    }

    @Override
    public void operation5() {
        System.out.println("class D 实现了 operation5");
    }
}

/**
 * A 类通过接口Interface1 依赖(使用) B类，但是只会用到1,2,3方法
 */
class A{

    public void fun1(cn.xinghaibay.principle.segregation.improve.Interface1 interface1){
        interface1.operation1();
    }

    public void fun2(cn.xinghaibay.principle.segregation.improve.Interface1 interface1){
        interface1.operation2();
    }

    public void fun3(cn.xinghaibay.principle.segregation.improve.Interface1 interface1){
        interface1.operation3();
    }
}

/**
 * C 类通过接口Interface1 依赖(使用) D类，但是只会用到1,4,5方法
 */
class C{

    public void fun1(cn.xinghaibay.principle.segregation.improve.Interface1 interface1){
        interface1.operation1();
    }

    public void fun4(cn.xinghaibay.principle.segregation.improve.Interface1 interface1){
        interface1.operation4();
    }

    public void fun5(cn.xinghaibay.principle.segregation.improve.Interface1 interface1){
        interface1.operation5();
    }
}