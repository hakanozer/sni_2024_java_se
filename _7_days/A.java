package _7_days;

public class A extends Base {

    public A() {
        System.out.println("A Call");
    }

    @Override
    public void call() {
        System.out.println("A Override Call");
    }

    public void sum(int a, int b) {
        int sm = a + b;
        System.out.println(sm);
    }

    
}
