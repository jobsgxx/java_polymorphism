package test;

public abstract class PersonAbstrct implements PersonBound{
    public void eat(){};
    public void sleep(){};
    public void talk(){};
    public void study(){
        System.out.println("这是独有的方法，只有人类才会学习");
    };
    public void play(){};
}
