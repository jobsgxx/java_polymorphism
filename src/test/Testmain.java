package test;

public class Testmain {
    public static void main(String[] args) {
        Person p = new Teacher();
        p.eat();
        p.study();
        p.sleep();
        p.talk();
        System.out.println(p.hashCode());
        System.out.println(p.name);
        System.out.println("-----------------------------");

        Teacher t = (Teacher)p;
        t.tech();
        t.eat();
        t.talk();
        System.out.println(t.name);

    }
}
