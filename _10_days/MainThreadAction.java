package _10_days;

public class MainThreadAction {
    public static void main(String[] args) {
        

        Runnable rn = () -> {
            try {
                String[] paths = {"1.jpg","2.jpg","3.jpg","4.jpg"};
                long start = System.currentTimeMillis();
                System.out.println(start);
                for (String path : paths) {
                    Upload up1 = new Upload(path);
                    up1.start();
                    //up1.join();
                }
            } catch (Exception e) { }
        };
        new Thread(rn).start();
        
        System.out.println("This line call");


    }
}
