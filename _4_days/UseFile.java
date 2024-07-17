package _4_days;

import java.io.File;
import java.io.FileWriter;
import java.time.LocalDateTime;
import java.util.Scanner;

public class UseFile {
    
    private File file = null;
    private File folder = new File("files");

    public UseFile() {
        controlFolder();
        LocalDateTime date = LocalDateTime.now();
        int year = date.getYear();
        int month = date.getMonthValue();
        int day = date.getDayOfMonth();
        String dateString = day+"-"+month+"-"+year+".txt";
        file = new File("files", dateString);
    }

    
    public UseFile(String fileName) {
        controlFolder();
        fileName = fileName+".txt";
        file = new File("files", fileName);
    }


    private void controlFolder() {
        if(!folder.isDirectory()) {
            folder.mkdir();
        }
    }


    public void createFile() {
        try {
            file.createNewFile();
        } catch (Exception e) {
            System.err.println("createFile error:" + e);
        }
    }

    public void deleteFile() {
        file.delete();
    }

    public void writeFile(String line) {
        //String os = System.getProperty("os.name");
        //System.out.println(os);
        try {
            FileWriter writer = new FileWriter(file, true);
            writer.append(line + System.lineSeparator());
            writer.close();
        } catch (Exception e) {
            System.err.println("writeFile error: " + e);
        }
    }

    public void readFile() {
        try {
            Scanner scanner = new Scanner(file);
            while(scanner.hasNextLine()) {
              String line = scanner.nextLine(); 
              System.out.println(line);
            }
            scanner.close();
        } catch (Exception e) {
            System.err.println("readFile error: " + e);
        }
    }

}
