package _10_days;

public class A {
    
    public static void call() {
        A a = new A();
        a.print();
        System.out.println("call line");
    }

    public final void print() {
        System.out.println("action call");
    }

}
