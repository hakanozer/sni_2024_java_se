package _10_days;

import _9_days.Computer;

public class MainApp {

    public static void main(String[] args) {
        
        Lib libx = new Lib();
        System.out.println(libx.age);

        Lib.name = "Ahmet Bil";
        System.out.println(Lib.name);

        int ac = Lib.action(30, 40);
        System.out.println(ac);

        final int count;
        count = 50;
        System.out.println(count);
        
        Computer computer = new Computer();
        
    }

}
