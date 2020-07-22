package cn.xinghaibay.principle.liskov;

public class Liskov {

    public static void main(String[] args) {
        A a = new A();
        System.out.println("4-2:"+a.func1(4,2));
        System.out.println("-------");
        B b = new B();
        System.out.println("4-2:"+b.func1(4,2));
        System.out.println("3+1+9:"+ b.func2(3,1));
    }
}

class A{
    public int func1(int a, int b){
        return a-b;
    }
}

class B extends A{
    public int func1(int a, int b){
        return a+b;
    }

    public int func2(int a, int b){
        return func1(a,b)+9;
    }
}