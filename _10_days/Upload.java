package _10_days;

public class Upload extends Thread {

    String imagePath;
    public Upload( String imagePath ) {
        this.imagePath = imagePath;
    }
    
    @Override
    public void run() {
        try {
            System.out.println(imagePath + " Upload Start");
            for (int i = 0; i < 10; i++) {
                Thread.sleep(1000);
                System.out.println(imagePath + " Upload...");
            }
            System.out.println(imagePath + " Upload Finish");
            long end = System.currentTimeMillis();
            System.out.println(end);
        } catch (Exception e) { }
    }

}
