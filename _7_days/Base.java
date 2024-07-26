package _7_days;

public class Base extends Action {

    public Base() {
        System.out.println("Base Call");
    }
    
    public void call() {
        System.out.println("Base Call");
    }

    final public void print() {
        write();
        System.out.println("Base Print");
    }

    private void write() {
        System.out.println("Write Call");
    }

}
