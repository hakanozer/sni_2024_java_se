package _7_days;
public class MainInheritance {
    public static void main(String[] args) {
        
        A a = new A();
        B b = new B();
        C c = new C();
        

        action(a);
        action(b);
        action(c);

    }

    public static void action(Base base) {
        base.call();
        int rnd = base.nextInt(100);
        System.out.println(rnd);
    }
}
