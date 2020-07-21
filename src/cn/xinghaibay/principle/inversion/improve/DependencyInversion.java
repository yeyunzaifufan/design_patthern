package cn.xinghaibay.principle.inversion.improve;

public class DependencyInversion {

    public static void main(String[] args) {
        Person person = new Person();
        person.receive(new Email());
        person.receive(new WeChat());
    }
}

interface IReceive{
    String getInfo();
}

class Email implements IReceive{
    public String getInfo(){
        return "电子邮件信息：hello， world";
    }
}

class WeChat implements IReceive{
    public String getInfo(){
        return "微信信息：hello， world";
    }
}

class Person{
    public void receive(IReceive receive){
        System.out.println(receive.getInfo());
    }
}
