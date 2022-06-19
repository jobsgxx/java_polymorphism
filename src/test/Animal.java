package test;

public class Animal implements PersonBound{
    public String name = "动物的名字";

    public void eat(){
        System.out.println("动物的吃饭方法");
    }
    public void sleep(){
        System.out.println("动物的睡觉方法");
    }
    public void talk(){
        System.out.println("动物有的可以说话");
    }
}
